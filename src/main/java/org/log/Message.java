package org.log;

public class Message {

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

	public static Message WarningMessage(Class<?> classname, String title, String message) {
		return new Message(Level.warning, classname, title, message);
	}

	public static Message WarningMessage(String title, String message) {
		return new Message(Level.warning, null, title, message);
	}

	public static Message WarningMessage(Class<?> classname, String message) {
		return new Message(Level.warning, classname, null, message);
	}

	public static Message WarningMessage(String message) {
		return new Message(Level.warning, null, null, message);
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
	
	public static Message FinestMessage(Class<?> classname, String title, String message) {
		return new Message(Level.finest, classname, title, message);
	}

	public static Message FinestMessage(String title, String message) {
		return new Message(Level.finest, null, title, message);
	}

	public static Message FinestMessage(Class<?> classname, String message) {
		return new Message(Level.finest, classname, null, message);
	}

	public static Message FinestMessage(String message) {
		return new Message(Level.finest, null, null, message);
	}
	

	// pojo
	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public Class<?> getClassname() {
		return classname;
	}

	public void setClassname(Class<?> classname) {
		this.classname = classname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		StringBuilder log = new StringBuilder();
		log.append("[ " + level.toAnsiString() + " ] ");
		if (classname != null)
			log.append("[ " + classname.getSimpleName() + " ] ");
		if (title != null)
			log.append("[ " + title + " ]");
		String line = log.toString();
		return line + " " + message.replace("\n", "\n" + line + " ");
	}

}
