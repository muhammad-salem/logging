package org.log.core;

import org.log.Level;

public interface LogFormate {
	void log(Level level, Class<?> classname, String title, String message);
	
	
}
