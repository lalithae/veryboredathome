package com.eooz.common.util;

import javax.servlet.http.HttpServletRequest;

public class RequestWrap {
	
	
	private HttpServletRequest request;
	
	
	public RequestWrap(HttpServletRequest request){
		this.request = request;
	}
	
	public String getParameter(String key){
		return this.request.getParameter(key);
	}
	
}