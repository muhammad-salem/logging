package org.log.interfae;

public interface BaseLog {
	
	void info(String message);
	void error(String message);
	void debug(String message);
	void warn(String message);
	void log(String message);
	void trace(String message);
	
	void info(String title, String message);
	void error(String title, String message);
	void debug(String title, String message);
	void warn(String title, String message);
	void log(String title, String message);
	void trace(String title, String message);
	
}
