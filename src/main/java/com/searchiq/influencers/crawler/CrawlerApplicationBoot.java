package com.searchiq.influencers.crawler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Version;

@SpringBootApplication
public class CrawlerApplicationBoot {
	
	@Value("${facebook.secret}")
	String fbSecret;

	@Value("${facebook.access.token}")
	String fbAccessToken;
	
	public static void main(String[] args) {
		SpringApplication.run(CrawlerApplicationBoot.class, args);
	}
	
	@Bean
	public FacebookClient getFaceBookClient() {
		return new DefaultFacebookClient(fbAccessToken, fbSecret, Version.VERSION_2_2);
	}
}
