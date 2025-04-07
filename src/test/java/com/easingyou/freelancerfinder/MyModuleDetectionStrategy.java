package com.easingyou.freelancerfinder;

import java.util.Set;
import java.util.stream.Stream;

import org.springframework.modulith.core.ApplicationModuleDetectionStrategy;
import org.springframework.modulith.core.JavaPackage;

class MyModuleDetectionStrategy implements ApplicationModuleDetectionStrategy {
	private static final Set<String> MY_MODULES = Set.of("bidding", "freelancer", "review");

	@Override public Stream<JavaPackage> getModuleBasePackages(JavaPackage basePackage) {
		return ApplicationModuleDetectionStrategy.directSubPackage().getModuleBasePackages(basePackage)
				.filter(jp -> MY_MODULES.contains(jp.getLocalName()));
	}
}
