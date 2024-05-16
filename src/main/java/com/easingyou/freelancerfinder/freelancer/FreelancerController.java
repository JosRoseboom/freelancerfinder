package com.easingyou.freelancerfinder.freelancer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.easingyou.freelancerfinder.service.ReportService;

@RestController
@RequestMapping("freelancer")
class FreelancerController { /* Freelancer controller for API */
	private ReportService reportService;
}
