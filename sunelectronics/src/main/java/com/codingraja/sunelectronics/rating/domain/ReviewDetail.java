package com.codingraja.sunelectronics.rating.domain;

import java.util.Date;
import java.util.List;

import com.codingraja.sunelectronics.core.domain.Customer;

public class ReviewDetail {
	private Long id;
	private Customer customer;
	private Date reivewSubmittedDate;
	private String reviewText;
	private String reviewStatus;
	private RatingSummary ratingSummary;
	private List<ReviewFeedback> reviewFeedback;
	private RatingDetail ratingDetails;
	public ReviewDetail(){}
}
