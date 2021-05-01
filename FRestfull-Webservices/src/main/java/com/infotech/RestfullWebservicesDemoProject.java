package com.infotech;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.LocaleResolver;

@SpringBootApplication
public class RestfullWebservicesDemoProject {

	public static void main(String[] args) {
		SpringApplication.run(RestfullWebservicesDemoProject.class, args);
	}
	
	@Bean
	public LocaleResolver localeResolver() {		
		SessionLocaleResolver localseResolver = new SessionLocaleResolver();
		localseResolver.setDefaultLocale(Locale.US);
		return localseResolver;
	}
	
	
	
	
	
	

}
