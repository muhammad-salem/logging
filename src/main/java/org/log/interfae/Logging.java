package org.log.interfae;

import org.log.beans.Level;
import org.log.beans.Message;

public interface Logging {
	
	LogFormater formater();

	
	default void log(Message message) {
		formater().log(message);
	}
	
	default void log(Level level, String message) {
		formater().log(level, null, null, message);
	}

	default void log(Level level, String title, String message) {
		formater().log(level, null , title, message);
	}
	
	default void log(Level level, Class<?> classname, String message) {
		formater().log(level, classname, null, message);
	}
	
	default void log(Level level, Class<?> classname, String title, String message) {
		formater().log(level, classname, title, message);
	}
	
	
}
