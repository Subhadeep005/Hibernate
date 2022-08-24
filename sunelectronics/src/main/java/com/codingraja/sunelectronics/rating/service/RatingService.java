package com.codingraja.sunelectronics.rating.service;

import java.util.List;

import com.codingraja.sunelectronics.core.domain.Customer;
import com.codingraja.sunelectronics.rating.domain.RatingSummary;
import com.codingraja.sunelectronics.rating.domain.ReviewDetail;

public interface RatingService {
	public RatingSummary saveRatingSummary(RatingSummary rating);
	public void deleteRatingSummary(RatingSummary rating);
	public RatingSummary readRatingSummary(String itemId);
	public List<ReviewDetail> readReviews(String itemId);
	public ReviewDetail readReviewByCustomerAndItem(Customer customer, String itemId);
}
