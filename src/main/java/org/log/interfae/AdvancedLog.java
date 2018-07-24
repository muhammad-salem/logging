package org.log.interfae;

public interface AdvancedLog extends BaseLog{
	
	
	void info(Class<?> classname, String message);
	void error(Class<?> classname, String message);
	void debug(Class<?> classname, String message);
	void warning(Class<?> classname, String message);
	void fine(Class<?> classname, String message);
	void trace(Class<?> classname, String message);
	
	void info(Class<?> classname, String title, String message);
	void error(Class<?> classname, String title, String message);
	void debug(Class<?> classname, String title, String message);
	void warning(Class<?> classname, String title, String message);
	void fine(Class<?> classname, String title, String message);
	void finer(Class<?> classname, String title, String message);
}
