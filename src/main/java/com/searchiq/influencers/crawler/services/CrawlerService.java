package com.searchiq.influencers.crawler.services;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.searchiq.influencers.crawler.api.model.CrawlerUser;

@Service
public class CrawlerService {

	public CrawlerUser fetchCrawlerUser() {
		return generateCrawlerUser();
	}
	
	private CrawlerUser generateCrawlerUser() {
		Calendar cal = Calendar.getInstance();
		cal.set(1970, 04, 12);
		CrawlerUser crawlerUser = new CrawlerUser();
		crawlerUser.setId(12345L);
		crawlerUser.setBirthDay(cal.getTime());
		crawlerUser.setFirstName("John");
		crawlerUser.setLastName("Michale");
		crawlerUser.setGender("Male");
		crawlerUser.setLocale("en_US");
		crawlerUser.setAccessLink("http://www.crawler.com/12345");
		crawlerUser.setVerified(true);
		crawlerUser.setTimezone(-8L);
		crawlerUser.setUpdatedTime(new Timestamp(new Date().getTime()));
		return crawlerUser;
	}

}
