package org.log.interfae;

import org.log.beans.Level;

public interface ClassNameLogging extends Logging, BaseLog {
	/**
	 * @return
	 */
	String  getClassName();
	
	
	default void info(String message) {
		log(Level.info,getClassName(), message);
	}
	
	default void error(String message) {
		log(Level.error, getClassName(), message);
	}
	
	default void debug(String message) {
		log(Level.debug, getClassName(), message);
	}
	
	default void warn(String message) {
		log(Level.warn, getClassName(), message);
	}
	
	default void log(String message) {
		log(Level.log, getClassName(), message);
	}
	
	default void trace(String message) {
		log(Level.trace, getClassName(), message);
	}
	
	

}
