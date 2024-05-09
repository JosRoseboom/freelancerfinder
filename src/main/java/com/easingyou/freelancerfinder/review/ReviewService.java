package com.easingyou.freelancerfinder.review;

import org.springframework.stereotype.Service;

import com.easingyou.freelancerfinder.freelancer.FreelancerService;

@Service
public class ReviewService {

	private final FreelancerService freelancerService;

	public ReviewService(FreelancerService freelancerService) {
		this.freelancerService = freelancerService;
	}
}
