package com.selenium;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;

public class GenLogs {

	public static void main(String[] args) {
		org.apache.log4j.Logger log=org.apache.log4j.Logger.getLogger("GenLogs.getClass().getName()");
		PropertyConfigurator.configure("log4j.properties");
		log.info("welcome to log4j");
		log.warn("this is for warning");
	}
}
