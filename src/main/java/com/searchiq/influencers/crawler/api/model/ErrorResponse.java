package com.searchiq.influencers.crawler.api.model;

public class ErrorResponse {
	private int errorCode;
	private String message;
	/**
	 * @return the errorCode
	 */
	public int getErrorCode() {
		return errorCode;
	}
	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	public ErrorResponse (int errorCode, String message){
		this.errorCode = errorCode;
		this.message = message;
	}
}
