/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.rating.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.codingraja.sunelectronics.core.domain.Customer;

/**
 * @author CL Verma
 *
 */
@Entity
@Table(name = "SUN_PRODUCT_RATING_DETAILS_MASTER")
public class RatingDetail implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RATING_ID")
	private Long id;
	private Double rating;

	@Column(name = "RATING_SUBMITTED_DATE")
	private Date ratingSubmittedDate;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "RATING_SUMMARY")
	private RatingSummary ratingSummary;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CUSTOMER_ID")
	private Customer customer;

	public RatingDetail() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Date getRatingSubmittedDate() {
		return ratingSubmittedDate;
	}

	public void setRatingSubmittedDate(Date ratingSubmittedDate) {
		this.ratingSubmittedDate = ratingSubmittedDate;
	}

	public RatingSummary getRatingSummary() {
		return ratingSummary;
	}

	public void setRatingSummary(RatingSummary ratingSummary) {
		this.ratingSummary = ratingSummary;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
