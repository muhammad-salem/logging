package org.log.beans.level;

import java.io.PrintStream;

import org.log.beans.Level;
import org.log.beans.Logger;
import org.log.interfae.LogFormater;

public class FineLogger extends Logger {

	public FineLogger(PrintStream print) {
		super(print);
	}
	
	public FineLogger(LogFormater formate) {
		super(formate);
	}
	
	
//	public void info(String message) {
//		log(Level.info, message);
//	}
//	
//	public void debug(String message) {
//		log(Level.debug, message);
//	}
//
//	public void warning(String message) {
//		log(Level.warning, message);
//	}
//
//	public void fine(String message) {
//		log(Level.fine, message);
//	}

	public void trace(String message) {
		
	}

	public void finest(String message) {
		
	}

	
	public void info(Class<?> classname, String message) {
		log(Level.info, classname, message);
	}

//	public void debug(Class<?> classname, String message) {
//		log(Level.debug, classname, message);
//	}
//
//	public void warning(Class<?> classname, String message) {
//		log(Level.warning, classname, message);
//	}
//
//	public void fine(Class<?> classname, String message) {
//		log(Level.fine, classname, message);
//	}

	public void trace(Class<?> classname, String message) {
		
	}

	public void finest(Class<?> classname, String message) {
		
	}

	
//	public void info(Class<?> classname, String title, String message) {
//		log(Level.info, classname, title, message);
//	}
//
//	public void debug(Class<?> classname, String title, String message) {
//		log(Level.debug, classname, title, message);
//	}
//
//	public void warning(Class<?> classname, String title, String message) {
//		log(Level.warning, classname, title, message);
//	}
//
//	public void fine(Class<?> classname, String title, String message) {
//		log(Level.fine, classname, title, message);
//	}

	public void finer(Class<?> classname, String title, String message) {
		
	}

	public void finest(Class<?> classname, String title, String message) {
		
	}
	
}
