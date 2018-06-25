package org.log;

import org.log.level.LoggerDebug;
import org.log.level.LoggerFine;
import org.log.level.LoggerFiner;
import org.log.level.LoggerFinest;
import org.log.level.LoggerInfo;
import org.log.level.LoggerOff;
import org.log.level.LoggerWarning;

public class Log {
	private  Log() {}

	private static  Logger logger;

    
    
//	static {
//		// default logger print all messages
//		Level level = Level.all;
//		String app_name = "log";
//		setLogLevel(app_name, level);
//		
//	}

	/**
	 * @param level
	 */
	public static void setLogLevel(String app_name, Level level) {
		
		switch (level) {
		case off:
			Log.setLogger(new LoggerOff(app_name, System.out));
			break;
		case debug:
			Log.setLogger(new LoggerDebug(app_name, System.out));
			break;
		case warning:
			Log.setLogger(new LoggerWarning(app_name, System.out));
			break;
		case info:
			Log.setLogger(new LoggerInfo(app_name, System.out));
			break;
		case fine:
			Log.setLogger(new LoggerFine(app_name, System.out));
			break;
		case finer:
			Log.setLogger(new LoggerFiner(app_name, System.out));
			break;
		case finest:
			Log.setLogger(new LoggerFinest(app_name, System.out));
			break;	
		case all:
		default:
			Log.setLogger(new SimpleLogger(app_name, System.out));
			break;
		}
	}
	
	public static void setLogger(Logger logger) {
		Log.logger = logger; 
	}
	
	public static Logger getLogger() {
		return logger;
	}
	
	public static void info(String message) {
		logger.info(message);
	}
	
	public static void debug(String message) {
		logger.info(message);
	}

	public static void warning(String message) {
		logger.info(message);
	}

	public static void fine(String message) {
		logger.fine(message);
	}

	public static void finer(String message) {
		logger.finer(message);
	}

	public static void finest(String message) {
		logger.finest(message);
	}

	
	public static void info(Class<?> classname, String message) {
		logger.info(classname, message);
	}

	public static void debug(Class<?> classname, String message) {
		logger.debug(classname, message);
	}

	public static void warning(Class<?> classname, String message) {
		logger.warning(classname, message);
	}

	public static void fine(Class<?> classname, String message) {
		logger.fine(classname, message);
	}

	public static void finer(Class<?> classname, String message) {
		logger.finer(classname, message);
	}

	public static void finest(Class<?> classname, String message) {
		logger.finest(classname, message);
	}

	public static void info(String title, String message) {
		logger.info(title, message);
	}

	public static void debug(String title, String message) {
		logger.debug(title, message);
	}

	public static void warning(String title, String message) {
		logger.warning(title, message);
	}

	public static void fine(String title, String message) {
		logger.fine(title, message);
	}

	public static void finer(String title, String message) {
		logger.finer(title, message);
	}

	public static void finest(String title, String message) {
		logger.finest(title, message);
	}
	
	
	public static void info(Class<?> classname, String title, String message) {
		logger.info(classname, title, message);
	}

	public static void debug(Class<?> classname, String title, String message) {
		logger.debug(classname, title, message);
	}

	public static void warning(Class<?> classname, String title, String message) {
		logger.warning(classname, title, message);
	}

	public static void fine(Class<?> classname, String title, String message) {
		logger.fine(classname, title, message);
	}

	public static void finer(Class<?> classname, String title, String message) {
		logger.finer(classname, title, message);
	}

	public static void finest(Class<?> classname, String title, String message) {
		logger.finest(classname, title, message);
	}
	
	public static void log(Level level, Class<?> classname, String title, String message) {
		logger.log(level, classname, title, message);
	}
}
