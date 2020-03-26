package org.log.concurrent;

import java.io.PrintStream;

import org.log.beans.Level;
import org.log.beans.LevelLogger;
import org.log.beans.Logger;
import org.log.interfae.LogFormater;

public final class Log {
	private Log() {}

	private static Logger logger = new LevelLogger(Level.info,  System.out);
	
	public static void level(String levelName) {
		level(Level.valueOf(levelName), System.out);
	}

	public static void level(Level level) {
		level(level, System.out);
	}

	public static void level(Level level, PrintStream printStream) {
		setLogger(new LevelLogger(level, printStream));
	}

	public static void setLogger(Logger logger) {
		Log.logger = logger;
	}

	public static void setLogger(LogFormater logFormate) {
		Log.logger = new Logger(logFormate);
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void error(String message) {logger.error(message);}
	public static void warn(String message) {logger.warn(message);}
	public static void info(String message) {logger.info(message);}
	public static void debug(String message) {logger.debug(message);}
	public static void trace(String message) {logger.trace(message);}
	public static void log(String message) {logger.log(message);}

	public static void error(Class<?> classname, String message) {logger.error(classname, message);}
	public static void warn(Class<?> classname, String message) {logger.warn(classname, message);}
	public static void info(Class<?> classname, String message) {logger.info(classname, message);}
	public static void debug(Class<?> classname, String message) {logger.debug(classname, message);}
	public static void trace(Class<?> classname, String message) {logger.trace(classname, message);}
	public static void log(Class<?> classname, String message) {logger.log(classname, message);}

	public static void error(String title, String message) {logger.error(title, message);}
	public static void warn(String title, String message) {logger.warn(title, message);}
	public static void info(String title, String message) {logger.info(title, message);}
	public static void debug(String title, String message) {logger.debug(title, message);}
	public static void trace(String title, String message) {logger.trace(title, message);}
	public static void log(String title, String message) {logger.log(title, message);}

	public static void error(Class<?> classname, String title, String message)
							{logger.error(classname, title, message);}
	public static void warn(Class<?> classname, String title, String message)
							{logger.warn(classname, title, message);}
	public static void info(Class<?> classname, String title, String message)
							{logger.info(classname, title, message);}
	public static void debug(Class<?> classname, String title, String message)
							{logger.debug(classname, title, message);}
	public static void trace(Class<?> classname, String title, String message)
							{logger.trace(classname, title, message);}
	public static void log(Class<?> classname, String title, String message)
							{logger.log(classname, title, message);}
}
