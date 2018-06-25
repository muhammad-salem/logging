package org.log;

import org.terminal.Ansi;

public interface Logging {
	
	LogFormate formate();
	
	Ansi ansi = new Ansi();
	default void log(Level level, String message) {
		log(level, null, message);
	}
	default void log(Level level, Class<?> classname, String message) {
		formate().log(level, classname, null, message);
	}
	
	default void log(Level level, Class<?> classname, String title, String message) {
		formate().log(level, classname, title, message);
	}
	
	default void log(Message message) {
		if(message == null) return;
		formate().log(message.getLevel(), message.getClassname(), message.getTitle(), message.getMessage());
	}
	
	
}
