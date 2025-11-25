package com.easingyou.freelancerfinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.modulith.Modulithic;

@SpringBootApplication
@Modulithic(sharedModules = "review")
class FreelancerFinderApp {

	static void main(String[] args) {
		SpringApplication.run(FreelancerFinderApp.class, args);
	}

}
