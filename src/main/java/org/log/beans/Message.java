package org.log.beans;

public class Message {
	public static Message ErrorMessage(Class<?> classname, String title, String message) {
		return new Message(Level.error, classname, title, message);
	}

	public static Message ErrorMessage(String title, String message) {
		return new Message(Level.error, null, title, message);
	}

	public static Message ErrorMessage(Class<?> classname, String message) {
		return new Message(Level.error, classname, null, message);
	}

	public static Message ErrorMessage(String message) {
		return new Message(Level.error, null, null, message);
	}

	public static Message DebugMessage(Class<?> classname, String title, String message) {
		return new Message(Level.debug, classname, title, message);
	}

	public static Message DebugMessage(String title, String message) {
		return new Message(Level.debug, null, title, message);
	}

	public static Message DebugMessage(Class<?> classname, String message) {
		return new Message(Level.debug, classname, null, message);
	}

	public static Message DebugMessage(String message) {
		return new Message(Level.debug, null, null, message);
	}

	public static Message WarnMessage(Class<?> classname, String title, String message) {
		return new Message(Level.warn, classname, title, message);
	}

	public static Message WarnMessage(String title, String message) {
		return new Message(Level.warn, null, title, message);
	}

	public static Message WarnMessage(Class<?> classname, String message) {
		return new Message(Level.warn, classname, null, message);
	}

	public static Message WarnMessage(String message) {
		return new Message(Level.warn, null, null, message);
	}
	
	
	public static Message InfoMessage(Class<?> classname, String title, String message) {
		return new Message(Level.info, classname, title, message);
	}

	public static Message InfoMessage(String title, String message) {
		return new Message(Level.info, null, title, message);
	}

	public static Message InfoMessage(Class<?> classname, String message) {
		return new Message(Level.info, classname, null, message);
	}

	public static Message InfoMessage(String message) {
		return new Message(Level.info, null, null, message);
	}
	
	
	public static Message FineMessage(Class<?> classname, String title, String message) {
		return new Message(Level.fine, classname, title, message);
	}

	public static Message FineMessage(String title, String message) {
		return new Message(Level.fine, null, title, message);
	}

	public static Message FineMessage(Class<?> classname, String message) {
		return new Message(Level.fine, classname, null, message);
	}

	public static Message FineMessage(String message) {
		return new Message(Level.fine, null, null, message);
	}
	
	public static Message FinerMessage(Class<?> classname, String title, String message) {
		return new Message(Level.finer, classname, title, message);
	}

	public static Message FinerMessage(String title, String message) {
		return new Message(Level.finer, null, title, message);
	}

	public static Message FinerMessage(Class<?> classname, String message) {
		return new Message(Level.finer, classname, null, message);
	}

	public static Message FinerMessage(String message) {
		return new Message(Level.finer, null, null, message);
	}
	
	public static Message TraceMessage(Class<?> classname, String title, String message) {
		return new Message(Level.trace, classname, title, message);
	}

	public static Message TraceMessage(String title, String message) {
		return new Message(Level.trace, null, title, message);
	}

	public static Message TraceMessage(Class<?> classname, String message) {
		return new Message(Level.trace, classname, null, message);
	}

	public static Message TraceMessage(String message) {
		return new Message(Level.trace, null, null, message);
	}
	
	private Level level;
	private Class<?> classname;
	private String title;
	private String message;

	public Message() {
		level = Level.off;
		classname = getClass();
		title = null;
		message = null;
	}

	public Message(Level level, Class<?> classname, String title, String message) {
		this.level = level;
		this.classname = classname;
		this.title = title;
		this.message = message;
	}
	

	
	public String level() {
		return level.toString();
	}

	public Level getLevel() {
		return level;
	}
	
	public String classname() {
		return classname.getSimpleName();
	}

	public String title() {
		return title;
	}

	public String message() {
		return message;
	}

}
