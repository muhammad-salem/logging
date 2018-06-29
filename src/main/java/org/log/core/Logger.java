package org.log.core;

import org.log.Level;

public interface Logger extends Logging{
	
	default void init(Runnable runnable) {
		runnable.run();
	}
	
	void print(String message);
	void println(String message);
	
	default void info(String message) {
		log(Level.info, message);
	}
	
	default void debug(String message) {
		log(Level.debug, message);
	}

	default void warning(String message) {
		log(Level.warning, message);
	}

	default void fine(String message) {
		log(Level.fine, message);
	}

	default void finer(String message) {
		log(Level.finer, message);
	}

	default void finest(String message) {
		log(Level.finest, message);
	}

	
	default void info(Class<?> classname, String message) {
		log(Level.info, classname, message);
	}

	default void debug(Class<?> classname, String message) {
		log(Level.debug, classname, message);
	}

	default void warning(Class<?> classname, String message) {
		log(Level.warning, classname, message);
	}

	default void fine(Class<?> classname, String message) {
		log(Level.fine, classname, message);
	}

	default void finer(Class<?> classname, String message) {
		log(Level.finer, classname, message);
	}

	default void finest(Class<?> classname, String message) {
		log(Level.finest, classname, message);
	}

	default void info(String title, String message) {
		log(Level.info, null, title, message);
	}

	default void debug(String title, String message) {
		log(Level.debug, null, title, message);
	}

	default void warning(String title, String message) {
		log(Level.warning, null, title, message);
	}

	default void fine(String title, String message) {
		log(Level.fine, null, title, message);
	}

	default void finer(String title, String message) {
		log(Level.finer, null, title, message);
	}

	default void finest(String title, String message) {
		log(Level.finest, null, title, message);
	}
	
	
	default void info(Class<?> classname, String title, String message) {
		log(Level.info, classname, title, message);
	}

	default void debug(Class<?> classname, String title, String message) {
		log(Level.debug, classname, title, message);
	}

	default void warning(Class<?> classname, String title, String message) {
		log(Level.warning, classname, title, message);
	}

	default void fine(Class<?> classname, String title, String message) {
		log(Level.fine, classname, title, message);
	}

	default void finer(Class<?> classname, String title, String message) {
		log(Level.finer, classname, title, message);
	}

	default void finest(Class<?> classname, String title, String message) {
		log(Level.finest, classname, title, message);
	}

}
