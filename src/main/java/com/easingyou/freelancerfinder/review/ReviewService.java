package com.easingyou.freelancerfinder.review;

import org.springframework.stereotype.Service;

import com.easingyou.freelancerfinder.freelancer.FreelancerService;
import com.easingyou.freelancerfinder.review.analysis.AnalyzerService;

@Service
public class ReviewService {

	private final FreelancerService freelancerService;
	private final AnalyzerService analyzerService;

	public ReviewService(FreelancerService freelancerService, AnalyzerService analyzerService) {
		this.freelancerService = freelancerService;
		this.analyzerService = analyzerService;
	}
}
