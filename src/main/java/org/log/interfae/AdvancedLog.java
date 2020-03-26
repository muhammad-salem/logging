package org.log.interfae;

public interface AdvancedLog extends BaseLog {
	
	
	void info(Class<?> classname, String message);
	void error(Class<?> classname, String message);
	void debug(Class<?> classname, String message);
	void warn(Class<?> classname, String message);
	void log(Class<?> classname, String message);
	void trace(Class<?> classname, String message);
	
	void info(Class<?> classname, String title, String message);
	void error(Class<?> classname, String title, String message);
	void debug(Class<?> classname, String title, String message);
	void warn(Class<?> classname, String title, String message);
	void log(Class<?> classname, String title, String message);
	void trace(Class<?> classname, String title, String message);
}
