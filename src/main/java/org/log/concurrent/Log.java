package org.log.concurrent;

import java.io.PrintStream;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.log.beans.Level;
import org.log.beans.LevelLogger;
import org.log.beans.Logger;
import org.log.beans.Message;
import org.log.interfae.LogFormater;

public final class Log {

	private Log() {
	}

	static {
		initService();
	}
	private static boolean active = false;

	public static boolean isActive() {
		return active;
	}

	private static Logger logger;
	private static ConcurrentLinkedQueue<Message> queue;
	private static ScheduledExecutorService ex;

	public static void stopLogging() {
		if (!queue.isEmpty()) {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {e.printStackTrace();}
		}
		ex.shutdownNow();
		queue.clear();
	}

	static void startLogging() {
		ex.scheduleAtFixedRate(Log::scheduleLoggingTask, 0, 100, TimeUnit.MILLISECONDS);
	}

	private static void initService() {
		if (queue == null)
			queue = new ConcurrentLinkedQueue<>();
		// else queue.clear();
		if (ex == null) {
			ex = new ScheduledThreadPoolExecutor(1);
			startLogging();
		}
		active = true;
	}

	private static void scheduleLoggingTask() {
		while (!queue.isEmpty()) {
			try {
				logger.log(queue.remove());
			} catch (Exception e) {

			}
		}
	}
	
	public static void level(String levelName) {
		Level level = Level.valueOf(levelName);
		level(level, System.out);
	}

	public static void level(Level level) {
		level(level, System.out);
	}

	public static void level(Level level, PrintStream printStream) {
		setLogger(new LevelLogger(level, printStream));
		 initService();
	}

	public static void setLogger(Logger logger) {
		Log.logger = logger;
	}

	public static void setLogger(LogFormater logFormate) {
		Log.logger = new Logger(logFormate);
		initService();
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void debug(String message) {
		queue.offer(Message.DebugMessage(message));
	}

	public static void debug(Class<?> classname, String message) {
		queue.offer(Message.DebugMessage(classname, message));
	}

	public static void debug(String title, String message) {
		queue.offer(Message.DebugMessage(title, message));
	}

	public static void debug(Class<?> classname, String title, String message) {
		queue.offer(Message.DebugMessage(classname, title, message));
	}

	public static void warn(String message) {
		queue.offer(Message.WarnMessage(message));
	}

	public static void warn(Class<?> classname, String message) {
		queue.offer(Message.WarnMessage(classname, message));
	}

	public static void warn(String title, String message) {
		queue.offer(Message.WarnMessage(title, message));
	}

	public static void warn(Class<?> classname, String title, String message) {
		queue.offer(Message.WarnMessage(classname, title, message));
	}

	public static void info(String message) {
		queue.offer(Message.InfoMessage(message));
	}

	public static void info(Class<?> classname, String message) {
		queue.offer(Message.InfoMessage(classname, message));
	}

	public static void info(String title, String message) {
		queue.offer(Message.InfoMessage(title, message));
	}

	public static void info(Class<?> classname, String title, String message) {
		queue.offer(Message.InfoMessage(classname, title, message));
	}

	public static void fine(String message) {
		queue.offer(Message.FineMessage(message));
	}

	public static void fine(Class<?> classname, String message) {
		queue.offer(Message.FineMessage(classname, message));
	}

	public static void fine(String title, String message) {
		queue.offer(Message.FineMessage(title, message));
	}

	public static void fine(Class<?> classname, String title, String message) {
		queue.offer(Message.FineMessage(classname, title, message));
	}

	public static void error(String message) {
		queue.offer(Message.ErrorMessage(message));
	}

	public static void error(Class<?> classname, String message) {
		queue.offer(Message.ErrorMessage(classname, message));
	}

	public static void error(String title, String message) {
		queue.offer(Message.ErrorMessage(title, message));
	}

	public static void error(Class<?> classname, String title, String message) {
		queue.offer(Message.ErrorMessage(classname, title, message));
	}

	public static void trace(String message) {
		queue.offer(Message.TraceMessage(message));
	}

	public static void trace(Class<?> classname, String message) {
		queue.offer(Message.TraceMessage(classname, message));
	}

	public static void trace(String title, String message) {
		queue.offer(Message.TraceMessage(title, message));
	}

	public static void trace(Class<?> classname, String title, String message) {
		queue.offer(Message.TraceMessage(classname, title, message));
	}

	public static void log(Message message) {
		queue.offer(message);
	}

	public static void log(Level level, Class<?> classname, String title, String message) {
		queue.offer(new Message(level, classname, title, message));
	}
}
