package org.log.interfae;

import org.log.beans.Level;

public interface LoggingInterface extends Logging, AdvancedLog{
	
	
	default void init(Runnable runnable) {
		runnable.run();
	}
	
	default void info(String message) {
		log(Level.info, message);
	}
	
	default void error(String message) {
		log(Level.error, message);
	}
	default void debug(String message) {
		log(Level.debug, message);
	}

	default void warn(String message) {
		log(Level.warn, message);
	}

	default void fine(String message) {
		log(Level.fine, message);
	}

	default void trace(String message) {
		log(Level.trace, message);
	}
	
	default void info(Class<?> classname, String message) {
		log(Level.info, classname, message);
	}
	
	default void error(Class<?> classname, String message) {
		log(Level.error, classname, message);
	}

	default void debug(Class<?> classname, String message) {
		log(Level.debug, classname, message);
	}

	default void warning(Class<?> classname, String message) {
		log(Level.warn, classname, message);
	}

	default void fine(Class<?> classname, String message) {
		log(Level.fine, classname, message);
	}

	default void trace(Class<?> classname, String message) {
		log(Level.trace, classname, message);
	}
	
	default void info(String title, String message) {
		log(Level.info, null, title, message);
	}
	
	default void error(String title, String message) {
		log(Level.error, null, title, message);
	}

	default void debug(String title, String message) {
		log(Level.debug, null, title, message);
	}

	default void warn(String title, String message) {
		log(Level.warn, null, title, message);
	}

	default void fine(String title, String message) {
		log(Level.fine, null, title, message);
	}

	default void trace(String title, String message) {
		log(Level.trace, null, title, message);
	}

	
	default void info(Class<?> classname, String title, String message) {
		log(Level.info, classname, title, message);
	}
	
	default void error(Class<?> classname, String title, String message) {
		log(Level.error, classname, title, message);
	}

	default void debug(Class<?> classname, String title, String message) {
		log(Level.debug, classname, title, message);
	}

	default void warning(Class<?> classname, String title, String message) {
		log(Level.warn, classname, title, message);
	}

	default void fine(Class<?> classname, String title, String message) {
		log(Level.fine, classname, title, message);
	}

	default void finer(Class<?> classname, String title, String message) {
		log(Level.trace, classname, title, message);
	}

}
