/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.commons.classloader.release;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * @author CL Verma
 *
 */
public class ThreadLocalManager {

	private static final Logger LOGGER = Logger.getLogger(ThreadLocalManager.class);

	private static final ThreadLocal<ThreadLocalManager> THREAD_LOCAL_MANAGER = new ThreadLocal<ThreadLocalManager>() {
		@Override
		protected ThreadLocalManager initialValue() {
			ThreadLocalManager manager = new ThreadLocalManager();
			String checkOrphans = System.getProperty("ThreadLocalManager.notify.orphans");
			if ("true".equals(checkOrphans)) {
				manager.marker = new RuntimeException(
						"Thread Local Manager is not empty - the following is the culprit call that setup the thread local but did not clear it.");
			}
			return manager;
		}
	};

	protected Map<Long, ThreadLocal> threadLocals = new LinkedHashMap<Long, ThreadLocal>();
	protected RuntimeException marker = null;

	public static void addThreadLocal(ThreadLocal threadLocal) {
		Long position;
		synchronized (threadLock) {
			count++;
			position = count;
		}
		THREAD_LOCAL_MANAGER.get().threadLocals.put(position, threadLocal);
	}

	public static <T> ThreadLocal<T> createThreadLocal(final Class<T> type) {
		return createThreadLocal(type, true);
	}

	public static <T> ThreadLocal<T> createThreadLocal(final Class<T> type, final boolean createInitialValue) {
		ThreadLocal<T> response = new ThreadLocal<T>() {
			@Override
			protected T initialValue() {
				addThreadLocal(this);
				if (!createInitialValue) {
					return null;
				}
				try {
					return type.newInstance();
				} catch (InstantiationException e) {
					throw new RuntimeException(e);
				} catch (IllegalAccessException e) {
					throw new RuntimeException(e);
				}
			}

			@Override
			public void set(T value) {
				super.get();
				super.set(value);
			}
		};
		return response;
	}

	public static void remove() {
		for (Map.Entry<Long, ThreadLocal> entry : THREAD_LOCAL_MANAGER.get().threadLocals.entrySet()) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("Removing ThreadLocal #" + entry.getKey() + " from request thread.");
			}
			entry.getValue().remove();
		}
		THREAD_LOCAL_MANAGER.get().threadLocals.clear();
		THREAD_LOCAL_MANAGER.remove();
	}

	public static void remove(ThreadLocal threadLocal) {
		Long removePosition = null;
		for (Map.Entry<Long, ThreadLocal> entry : THREAD_LOCAL_MANAGER.get().threadLocals.entrySet()) {
			if (entry.getValue().equals(threadLocal)) {
				if (LOGGER.isDebugEnabled()) {
					LOGGER.debug("Removing ThreadLocal #" + entry.getKey() + " from request thread.");
				}
				entry.getValue().remove();
				removePosition = entry.getKey();
			}
		}
		THREAD_LOCAL_MANAGER.get().threadLocals.remove(removePosition);
	}

	private static Long count = 0L;
	private static final Object threadLock = new Object();

	@Override
	public String toString() {
		if (!threadLocals.isEmpty() && marker != null) {
			marker.printStackTrace();
		}
		return super.toString();
	}
}
