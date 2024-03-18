package com.prowings.log4j;

//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.LogManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog4j {
	
	public static final Logger logger = LoggerFactory.getLogger(TestLog4j.class);// slf4j
	
//	public static final Logger logger = LogManager.getLogger(TestLog4j.class);// log4j
	
	
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		long duration = 61 * 1000;
		
		while(System.currentTimeMillis() - startTime < duration)
		{
		logger.info("AN INFO MESSAGE");
		logger.debug("A DEBUG MESSAGE");
		logger.trace("A TRACE MESSAGE");
		logger.warn("A WARN MESSAGE");
		logger.error("A ERROR MESSAGE");
		
//		logger.fatal("A FATAL MESSAGE");
		}
		
		System.out.println("Run Complete !!!");
	
	}

}
