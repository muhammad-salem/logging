package org.log;

public class PrintLogger {

	Class<?> classname;
	public  PrintLogger(Class<?> classname) {
		this.classname = classname;
	}
	
	public void print(String message) {
		Log.print(message);
	}
	
	public void println(String message) {
		Log.println(message);
	}
	
	public void debug(String message) {
		Log.debug(classname, message);
	}
	public void debug(String title, String message) {
		Log.debug(classname, title, message);
	}
	
	public void warning(String message) {
		Log.warning(classname, message);
	}
	public void warning(String title, String message) {
		Log.warning(classname, title, message);
	}
	
	
	public void info(String message) {
		Log.info(classname, message);
	}
	public void info(String title, String message) {
		Log.info(classname, title, message);
	}
	
	public void fine(String message) {
		Log.fine(classname, message);
	}
	public void fine(String title, String message) {
		Log.fine(classname, title, message);
	}
	
	public void finer(String message) {
		Log.finer(classname, message);
	}
	public void finer(String title, String message) {
		Log.finer(classname, title, message);
	}
	
	public void finest(String message) {
		Log.finest(classname, message);
	}
	public void finest(String title, String message) {
		Log.finest(classname, title, message);
	}
	
	
	public void log(Message message) {
		Log.log( message);
	}
	
	public void log(Level level, Class<?> classname, String title, String message) {
		Log.log(new Message(level, classname, title, message));
	}
}
