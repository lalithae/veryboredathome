package com.eooz.common.util;

import org.slf4j.LoggerFactory;

public class Logger {

	public static void info(Class<?> vlass, String message, Exception e){
		
		org.slf4j.Logger logger = LoggerFactory.getLogger(vlass);
		logger.info(message+e);
		
	}
	
	
	public static void error(Class<?> vlass, String message, Exception e){
		
		org.slf4j.Logger logger = LoggerFactory.getLogger(vlass);
		logger.error(message+e);
		
	}
	

	
}
