/*
 * Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 *
 * @author  CL Verma
 */

/**
 * 
 */
package com.codingraja.sunelectronics.security.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.codingraja.sunelectronics.core.domain.User;
import com.codingraja.sunelectronics.core.domain.UserRole;
import com.codingraja.sunelectronics.core.service.UserService;

/**
 * @author CL Verma
 *
 */

public class UserDetailsServiceImpl implements UserDetailsService {

	private static final Logger logger = Logger.getLogger(UserDetailsServiceImpl.class);

	@Autowired
	private UserService userService;

	public UserDetailsServiceImpl(UserService userService) {
		super();
		this.userService = userService;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.security.core.userdetails.UserDetailsService#
	 * loadUserByUsername(java.lang.String)
	 */
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// Getting the User by Username from Database
		User user = this.userService.findUserByUsername(username);
		logger.info(user.getUsername() + " - " + user.getPassword());
		logger.info(user.getUserRoles());
		/*
		 * convert Set<UserRole> to Set<GrantedAuthority>
		 * 
		 * @See loadUserRoleByUsername()
		 */
		Set<GrantedAuthority> authorities = loadUserRoleByUsername(user.getUserRoles());

		logger.info("Calling loadUserByUsername()");
		/*
		 * convert com.codingraja.spring.domain.User to
		 * org.springframework.security.core.userdetails.User and return
		 * 
		 * @See convertUserToSpringSecurityUser()
		 */
		return convertUserToSpringSecurityUser(user, authorities);
	}

	/*
	 * This method is used to convert Set<UserRole> to Set<GrantedAuthority>
	 */
	private Set<GrantedAuthority> loadUserRoleByUsername(Set<UserRole> userRoles) {
		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();

		for (UserRole userRole : userRoles) {
			logger.info(userRole.getRole());
			authorities.add(new SimpleGrantedAuthority(userRole.getRole()));
		}
		return authorities;
	}

	/*
	 * This method is used to convert User to Spring Security User Object
	 */
	private UserDetails convertUserToSpringSecurityUser(final User user, final Set<GrantedAuthority> authorities) {
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				user.isEnabled(), true, // accountNonExpired
				true, // credentialsNonExpired
				true, // accountNonLocked
				authorities);
	}
}
