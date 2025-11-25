package com.easingyou.freelancerfinder.bidding;

import org.springframework.stereotype.Service;

import com.easingyou.freelancerfinder.freelancer.FreelancerService;
import com.easingyou.freelancerfinder.review.ReviewService;

@Service
public class BidService { /* Bid service logic */

	private FreelancerService freelancerService;
	private ReviewService reviewService;
}
