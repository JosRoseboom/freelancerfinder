package com.easingyou.freelancerfinder;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

class ModuleVerificationsTest {

	@Test
	void testModules() {
		ApplicationModules.of(FreelancerFinderApp.class).verify();
	}
}
