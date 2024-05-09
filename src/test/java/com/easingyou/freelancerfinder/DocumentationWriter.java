package com.easingyou.freelancerfinder;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

public class DocumentationWriter {

	/*
     Running this test generates documentation and stores it in target/spring-modulith-docs . You can find there:
     - components.puml : plantUML all our modules and how they relate

     for each module, e.g. address, documentation:
     - module-bidding.puml: plantUML of bidding and all the direct dependencies
     - module-bidding-simple.puml: plantUML of bidding and all its direct dependencies without the relations between those dependencies (only to bidding)
     - module-bidding.adoc: asciidoc of bidding module

     depends on means: having a type dependency
     uses means: has a spring bean of that module
     listens to means: listens to an event of that module
    */
	@Test
	@Disabled("Enable (or just run in intellij) this test to generate documentation. We don't do that by default.")
	void writeDocumentationSnippets() {
		final ApplicationModules modules = ApplicationModules.of(FreelancerFinderApp.class);
		final Documenter documenter = new Documenter(modules);

		modules.forEach(applicationModule -> {
			documenter.writeModuleAsPlantUml(
					applicationModule,
					Documenter.DiagramOptions.defaults()
							.withTargetOnly(am -> !am.equals(applicationModule))
							.withTargetFileName("module-%s-simple.puml"));
		});

		documenter.writeDocumentation();
		// writeDocumentation does all the 3 below in 1 call:
		//                .writeModulesAsPlantUml()
		//                .writeIndividualModulesAsPlantUml()
		//                .writeModuleCanvases();
	}
}
