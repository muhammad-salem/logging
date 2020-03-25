package org.log.concurrent;

import java.io.PrintStream;

import org.log.beans.Level;
import org.log.beans.LevelLogger;
import org.log.beans.Logger;
import org.log.beans.Message;
import org.log.interfae.LogFormater;

public final class Log {
	private Log() {}

	private static Logger logger = Level.info.newLogger(System.out);
	
	public static void level(String levelName) {
//		Log.logger = Level.valueOf(levelName).newLogger(System.out);
		level(Level.valueOf(levelName), System.out);
	}

	public static void level(Level level) {
//		Log.logger = level.newLogger(System.out);
		level(level, System.out);
	}

	public static void level(Level level, PrintStream printStream) {
//		Log.logger = level.newLogger(printStream);
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

	public static void debug(String message) {
		logger.log(Message.DebugMessage(message));
	}

	public static void debug(Class<?> classname, String message) {
		logger.log(Message.DebugMessage(classname, message));
	}

	public static void debug(String title, String message) {
		logger.log(Message.DebugMessage(title, message));
	}

	public static void debug(Class<?> classname, String title, String message) {
		logger.log(Message.DebugMessage(classname, title, message));
	}

	public static void warn(String message) {
		logger.log(Message.WarnMessage(message));
	}

	public static void warn(Class<?> classname, String message) {
		logger.log(Message.WarnMessage(classname, message));
	}

	public static void warn(String title, String message) {
		logger.log(Message.WarnMessage(title, message));
	}

	public static void warn(Class<?> classname, String title, String message) {
		logger.log(Message.WarnMessage(classname, title, message));
	}

	public static void info(String message) {
		logger.log(Message.InfoMessage(message));
	}

	public static void info(Class<?> classname, String message) {
		logger.log(Message.InfoMessage(classname, message));
	}

	public static void info(String title, String message) {
		logger.log(Message.InfoMessage(title, message));
	}

	public static void info(Class<?> classname, String title, String message) {
		logger.log(Message.InfoMessage(classname, title, message));
	}

	public static void fine(String message) {
		logger.log(Message.FineMessage(message));
	}

	public static void fine(Class<?> classname, String message) {
		logger.log(Message.FineMessage(classname, message));
	}

	public static void fine(String title, String message) {
		logger.log(Message.FineMessage(title, message));
	}

	public static void fine(Class<?> classname, String title, String message) {
		logger.log(Message.FineMessage(classname, title, message));
	}
	


	public static void finer(String message) {
		logger.log(Message.FinerMessage(message));
	}

	public static void finer(Class<?> classname, String message) {
		logger.log(Message.FinerMessage(classname, message));
	}

	public static void finer(String title, String message) {
		logger.log(Message.FinerMessage(title, message));
	}

	public static void finer(Class<?> classname, String title, String message) {
		logger.log(Message.FinerMessage(classname, title, message));
	}

	public static void error(String message) {
		logger.log(Message.ErrorMessage(message));
	}

	public static void error(Class<?> classname, String message) {
		logger.log(Message.ErrorMessage(classname, message));
	}

	public static void error(String title, String message) {
		logger.log(Message.ErrorMessage(title, message));
	}

	public static void error(Class<?> classname, String title, String message) {
		logger.log(Message.ErrorMessage(classname, title, message));
	}

	public static void trace(String message) {
		logger.log(Message.TraceMessage(message));
	}

	public static void trace(Class<?> classname, String message) {
		logger.log(Message.TraceMessage(classname, message));
	}

	public static void trace(String title, String message) {
		logger.log(Message.TraceMessage(title, message));
	}

	public static void trace(Class<?> classname, String title, String message) {
		logger.log(Message.TraceMessage(classname, title, message));
	}

	public static void log(Message message) {
		logger.log(message);
	}

	public static void log(Level level, Class<?> classname, String title, String message) {
		logger.log(new Message(level, classname, title, message));
	}
}
