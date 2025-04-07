package com.easingyou.freelancerfinder;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

class ModuleVerificationsTest {

	@Test
	void testModules() {
		final ApplicationModules applicationModules = ApplicationModules.of(FreelancerFinderApp.class);
		System.out.println(applicationModules);
		applicationModules.verify();
	}
}
