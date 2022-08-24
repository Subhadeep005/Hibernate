package com.codingraja.sunelectronics.rating.domain;

import java.util.ArrayList;
import java.util.List;

public class RatingSummary {
	protected Long id;
	protected String itemId;
	protected String ratingTypeStr;
	protected Double averageRating = new Double(0);
	protected List<RatingDetail> ratings = new ArrayList<RatingDetail>();
	protected List<ReviewDetail> reviews = new ArrayList<ReviewDetail>();
	public RatingSummary(){}
}
