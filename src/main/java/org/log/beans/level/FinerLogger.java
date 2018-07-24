package org.log.beans.level;

import java.io.PrintStream;

import org.log.beans.Logger;
import org.log.interfae.LogFormater;

public class FinerLogger extends Logger {

	public FinerLogger(PrintStream print) {
		super(print);
	}
	
	public FinerLogger(LogFormater formate) {
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
//
//	public void finer(String message) {
//		log(Level.finer, message);
//	}

	public void finest(String message) {
		
	}

	
//	public void info(Class<?> classname, String message) {
//		log(Level.info, classname, message);
//	}
//
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
//
//	public void finer(Class<?> classname, String message) {
//		log(Level.finer, classname, message);
//	}

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
//
//	public void finer(Class<?> classname, String title, String message) {
//		log(Level.finer, classname, title, message);
//	}

	public void finest(Class<?> classname, String title, String message) {
		
	}
	
}
