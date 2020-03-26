package org.log.interfae;

import org.log.beans.Level;

public interface LoggingInterface extends Logging, AdvancedLog {
	
	default void error( String message) {
		log(Level.error, message);
	}
	
	default void warn(String message) {
		log(Level.warn, message);
	}
	
	default void info(String message) {
		log(Level.info, message);
	}
	
	default void debug(String message) {
		log(Level.debug, message);
	}
	
	default void trace(String message) {
		log(Level.trace, message);
	}
	default void log(String message) {
		log(Level.log, message);
	}

	
	

	
	default void error(Class<?> classname, String message) {
		log(Level.error, classname, message);
	}
	
	default void warn(Class<?> classname, String message) {
		log(Level.warn, classname, message);
	}
	
	default void info(Class<?> classname, String message) {
		log(Level.info, classname, message);
	}
	
	default void debug(Class<?> classname, String message) {
		log(Level.debug, classname, message);
	}
	
	default void trace(Class<?> classname, String message) {
		log(Level.trace, classname, message);
	}

	default void log(Class<?> classname, String message) {
		log(Level.log, classname, message);
	}

	
	
	default void error(String title, String message) {
		log(Level.error, title, message);
	}
	
	default void warn(String title, String message) {
		log(Level.warn, title, message);
	}
	
	default void info(String title, String message) {
		log(Level.info, title, message);
	}
	
	default void debug(String title, String message) {
		log(Level.debug, title, message);
	}
	
	default void trace( String title, String message) {
		log(Level.trace, title, message);
	}

	default void log(String title, String message) {
		log(Level.log, title, message);
	}



	
	default void error(Class<?> classname, String title, String message) {
		log(Level.error, classname, title, message);
	}
	
	default void warn(Class<?> classname, String title, String message) {
		log(Level.warn, classname, title, message);
	}
	
	default void info(Class<?> classname, String title, String message) {
		log(Level.info, classname, title, message);
	}
	
	default void debug(Class<?> classname, String title, String message) {
		log(Level.debug, classname, title, message);
	}
	
	default void trace(Class<?> classname, String title, String message) {
		log(Level.trace, classname, title, message);
	}

	default void log(Class<?> classname, String title, String message) {
		log(Level.log, classname, title, message);
	}
}
