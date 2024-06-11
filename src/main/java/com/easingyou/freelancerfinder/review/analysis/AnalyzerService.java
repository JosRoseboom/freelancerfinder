package com.easingyou.freelancerfinder.review.analysis;

import org.springframework.stereotype.Service;

@Service
public class AnalyzerService {

	private final ReviewAnalyzer reviewAnalyzer;
	private final SentimentAnalyzer sentimentAnalyzer;
	private final TrendDetector trendDetector;

	AnalyzerService(ReviewAnalyzer reviewAnalyzer, SentimentAnalyzer sentimentAnalyzer, TrendDetector trendDetector) {
		this.reviewAnalyzer = reviewAnalyzer;
		this.sentimentAnalyzer = sentimentAnalyzer;
		this.trendDetector = trendDetector;
	}

}
