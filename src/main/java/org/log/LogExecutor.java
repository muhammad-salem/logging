package org.log;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.log.level.LoggerDebug;
import org.log.level.LoggerFine;
import org.log.level.LoggerFiner;
import org.log.level.LoggerFinest;
import org.log.level.LoggerInfo;
import org.log.level.LoggerOff;
import org.log.level.LoggerWarning;

public class LogExecutor {

	private  LogExecutor() {}

	private static  Logger logger;

    private static ConcurrentLinkedQueue<Message> queue = new ConcurrentLinkedQueue<>();
    private static ScheduledExecutorService ex = new ScheduledThreadPoolExecutor(1);
    
    
    
    private static void logScheduleAtFixedRate() {
    	while (!queue.isEmpty()) {
    		try {
				logger.log(queue.remove());
			} catch (Exception e1) {
				
			}
		}
	}
    
//    private static void logRunnable() {
//    	while (true) {
//			if(queue.isEmpty()) {
//				try {TimeUnit.MILLISECONDS.sleep(100);} catch (Exception e) {break;}
//			}else {
//				logger.log(queue.poll());
//			}
//		}
//	}
    
    public static void  startLogging() {
    	ex.scheduleAtFixedRate(LogExecutor::logScheduleAtFixedRate, 0, 100, TimeUnit.MILLISECONDS);
	}
    
    


	/**
	 * @param level
	 */
	public static void setLogLevel(String app_name, Level level) {
		
		switch (level) {
		case off:
			LogExecutor.setLogger(new LoggerOff(app_name, System.out));
			break;
		case debug:
			LogExecutor.setLogger(new LoggerDebug(app_name, System.out));
			break;
		case warning:
			LogExecutor.setLogger(new LoggerWarning(app_name, System.out));
			break;
		case info:
			LogExecutor.setLogger(new LoggerInfo(app_name, System.out));
			break;
		case fine:
			LogExecutor.setLogger(new LoggerFine(app_name, System.out));
			break;
		case finer:
			LogExecutor.setLogger(new LoggerFiner(app_name, System.out));
			break;
		case finest:
			LogExecutor.setLogger(new LoggerFinest(app_name, System.out));
			break;	
		case all:
		default:
			LogExecutor.setLogger(new SimpleLogger(app_name, System.out));
			break;
		}
		getLogger().init(LogExecutor::startLogging);
	}
	
	public static void setLogger(Logger logger) {
		LogExecutor.logger = logger; 
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
	
	
	
	public static void warning(String message) {
		queue.offer(Message.WarningMessage(message));
	}
	
	public static void warning(Class<?> classname, String message) {
		queue.offer(Message.WarningMessage(classname, message));
	}
	
	public static void warning(String title, String message) {
		queue.offer(Message.WarningMessage(title, message));
	}
	public static void warning(Class<?> classname, String title, String message) {
		queue.offer(Message.WarningMessage(classname, title, message));
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

	
	
	
	
	
	public static void finer(String message) {
		queue.offer(Message.FinerMessage(message));
	}
	public static void finer(Class<?> classname, String message) {
		queue.offer(Message.FinerMessage(classname, message));
	}
	public static void finer(String title, String message) {
		queue.offer(Message.FinerMessage(title, message));
	}
	public static void finer(Class<?> classname, String title, String message) {
		queue.offer(Message.FinerMessage(classname, title, message));
	}
	
	public static void finest(String message) {
		queue.offer(Message.FinestMessage(message));
	}
	public static void finest(Class<?> classname, String message) {
		queue.offer(Message.FinestMessage(classname, message));
	}
	public static void finest(String title, String message) {
		queue.offer(Message.FinestMessage(title, message));
	}
	public static void finest(Class<?> classname, String title, String message) {
		queue.offer(Message.FinestMessage(classname, title, message));
	}
	
	
	public static void log(Message message) {
		queue.offer( message);
	}
	
	public static void log(Level level, Class<?> classname, String title, String message) {
		queue.offer(new Message(level, classname, title, message));
	}
}
