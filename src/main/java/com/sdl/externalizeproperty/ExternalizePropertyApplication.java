package com.sdl.externalizeproperty;

import com.sdl.externalizeproperty.service.ApplicationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExternalizePropertyApplication implements CommandLineRunner {

	final ApplicationService applicationService;

	public ExternalizePropertyApplication(ApplicationService applicationService) {
		this.applicationService = applicationService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ExternalizePropertyApplication.class, args);
	}

	@Override
	public void run(String... args) {
		applicationService.displayAppName();
	}
}
