package org.log.interfae;

import org.log.beans.Level;

public interface ClassLogging extends Logging, BaseLog {
	/**
	 * @return
	 */
	Class<?> getObjectClass();
	
	
	default void info(String message) {
		log(Level.info,getObjectClass(), message);
	}
	
	default void log(String message) {
		log(Level.log,getObjectClass(), message);
	}
	
	default void error(String message) {
		log(Level.error, getObjectClass(), message);
	}
	
	default void debug(String message) {
		log(Level.debug, getObjectClass(), message);
	}
	
	default void warn(String message) {
		log(Level.warn, getObjectClass(), message);
	}
	
	default void trace(String message) {
		log(Level.trace, getObjectClass(), message);
	}
	
	default void info(String title, String message) {
		log(Level.info, getObjectClass(), title, message);
	}
	
	default void log(String title, String message) {
		log(Level.log, getObjectClass(), title, message);
	}
	
	default void error(String title, String message) {
		log(Level.error, getObjectClass(), title, message);
	}
	
	default void debug(String title, String message) {
		log(Level.debug, getObjectClass(), title, message);
	}
	
	default void warn(String title, String message) {
		log(Level.warn, getObjectClass(), title, message);
	}
	
	
	default void trace(String title, String message) {
		log(Level.trace, getObjectClass(), title, message);
	}
	
	

}
