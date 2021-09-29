package com.testium.project;

import org.apache.log4j.Logger;

public class Log4j {
	
	private static Logger logger = Logger.getLogger(Log4j.class.getName());

    public static void info (String parameter) {
        logger.info("This is info : " + parameter);
    }

    public static void warn (String parameter) {
        logger.warn("This is warn : " + parameter);
    }

    public static void error (String parameter) {
    	logger.error("This is error : " + parameter);
    }

    public static void fatal (String parameter) {
        logger.fatal("This is fatal : " + parameter);
    }

    public static void debug (String parameter) {
    	if(logger.isDebugEnabled()){
    	    logger.debug("This is debug :" + parameter);
    	}
    }
}
