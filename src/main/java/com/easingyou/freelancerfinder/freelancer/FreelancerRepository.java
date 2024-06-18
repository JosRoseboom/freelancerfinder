package com.easingyou.freelancerfinder.freelancer;

import org.springframework.stereotype.Repository;

@Repository
interface FreelancerRepository {
	default Freelancer findById(long freelancerId){
		return new Freelancer();
	}
}
