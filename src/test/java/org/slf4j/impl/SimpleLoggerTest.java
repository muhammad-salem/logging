package org.slf4j.impl;

import org.junit.Test;

public class SimpleLoggerTest {

	@Test
	public void test() {
		SimpleAnsiLoggerFactory factory = new SimpleAnsiLoggerFactory(); 
		SimpleAnsiLogger logger = (SimpleAnsiLogger) factory.getLogger(SimpleLoggerTest.class.getName());
		logger.debug("hi");
		
	}

}
