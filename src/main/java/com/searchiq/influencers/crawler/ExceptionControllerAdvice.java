package com.searchiq.influencers.crawler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.searchiq.influencers.crawler.api.model.ErrorResponse;

@ControllerAdvice
public class ExceptionControllerAdvice {

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorResponse> exception(Exception ex) {
		return null;
	}
	
}