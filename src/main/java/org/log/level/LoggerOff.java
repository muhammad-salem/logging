package org.log.level;

import java.io.PrintStream;

import org.log.SimpleLogger;

public class LoggerOff extends SimpleLogger {

	public LoggerOff(String app_name, PrintStream print) {
		super(app_name, print);
	}
	
	public void info(String message) {
		
	}
	
	public void debug(String message) {
		
	}

	public void warning(String message) {
		
	}

	public void fine(String message) {
		
	}

	public void finer(String message) {
		
	}

	public void finest(String message) {
		
	}

	
	public void info(Class<?> classname, String message) {
		
	}

	public void debug(Class<?> classname, String message) {
		
	}

	public void warning(Class<?> classname, String message) {
		
	}

	public void fine(Class<?> classname, String message) {
		
	}

	public void finer(Class<?> classname, String message) {
		
	}

	public void finest(Class<?> classname, String message) {
		
	}

	
	public void info(Class<?> classname, String title, String message) {
		
	}

	public void debug(Class<?> classname, String title, String message) {
		
	}

	public void warning(Class<?> classname, String title, String message) {
		
	}

	public void fine(Class<?> classname, String title, String message) {
		
	}

	public void finer(Class<?> classname, String title, String message) {
		
	}

	public void finest(Class<?> classname, String title, String message) {
		
	}
	
}
