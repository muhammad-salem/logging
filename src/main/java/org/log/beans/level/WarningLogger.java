package org.log.beans.level;

import java.io.PrintStream;

import org.log.beans.Logger;
import org.log.interfae.LogFormater;

public class WarningLogger extends Logger {

	public WarningLogger(PrintStream print) {
		super(print);
	}
	
	public WarningLogger( LogFormater formate) {
		super(formate);
	}
	

	
//	public void debug(String message) {
//		log(Level.debug, message);
//	}
//
//	public void warning(String message) {
//		log(Level.warning, message);
//	}
	
	public void info(String message) {
		
	}
	public void fine(String message) {
		
	}

	public void trace(String message) {
		
	}

	public void finest(String message) {
		
	}



//	public void debug(Class<?> classname, String message) {
//		log(Level.debug, classname, message);
//	}
//
//	public void warning(Class<?> classname, String message) {
//		log(Level.warning, classname, message);
//	}
	
	public void info(Class<?> classname, String message) {
		
	}
	public void fine(Class<?> classname, String message) {
		
	}

	public void trace(Class<?> classname, String message) {
		
	}

	public void finest(Class<?> classname, String message) {
		
	}


//	public void debug(Class<?> classname, String title, String message) {
//		log(Level.debug, classname, title, message);
//	}
//
//	public void warning(Class<?> classname, String title, String message) {
//		log(Level.warning, classname, title, message);
//	}
	
	public void info(Class<?> classname, String title, String message) {
		
	}

	public void fine(Class<?> classname, String title, String message) {
		
	}

	public void finer(Class<?> classname, String title, String message) {
		
	}

	public void finest(Class<?> classname, String title, String message) {
		
	}
	
}
