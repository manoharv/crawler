package com.searchiq.influencers.crawler.api.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.searchiq.influencers.crawler.api.model.CrawlerUser;
import com.searchiq.influencers.crawler.services.CrawlerService;

@RestController
@RequestMapping("/searchiq")
public class SearchIqController {
	
	@Autowired
	CrawlerService crawlerService;
	
	@RequestMapping(value = "/get/user", method = RequestMethod.GET)
	public ResponseEntity<CrawlerUser> getCrawlerUser() {
		CrawlerUser crawlerUser = crawlerService.fetchCrawlerUser();
		return new ResponseEntity<>(crawlerUser, HttpStatus.OK);
	}

}
