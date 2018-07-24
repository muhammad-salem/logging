package org.log.beans.level;

import java.io.PrintStream;

import org.log.beans.Logger;
import org.log.interfae.LogFormater;

public class ErrorLogger extends Logger {

	public ErrorLogger(PrintStream printStream) {
		super(printStream);
	}

	public ErrorLogger(LogFormater logFormate) {
		super(logFormate);
	}
	
	
	public void info(String message) {
		
	}
	
	public void debug(String message) {
		
	}

	public void warn(String message) {
		
	}

	public void fine(String message) {
		
	}

	public void trace(String message) {
		
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

	public void trace(Class<?> classname, String message) {
		
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
