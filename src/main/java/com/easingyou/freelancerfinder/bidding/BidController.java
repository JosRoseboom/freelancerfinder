package com.easingyou.freelancerfinder.bidding;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.easingyou.freelancerfinder.service.ReportService;

@RestController
@RequestMapping("bid")
class BidController { /* Bid controller for API */
	private ReportService reportService;
}
