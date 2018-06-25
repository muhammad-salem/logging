package org.log;

public interface LogFormate {
	void log(Level level, Class<?> classname, String title, String message);
	
	
}
