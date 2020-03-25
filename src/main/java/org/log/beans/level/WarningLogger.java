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
	
	@Override public void info(String message) {}
	@Override public void debug(String message) {}
	@Override public void trace(String message) {}
	@Override public void fine(String message) {}
	@Override public void finer(String message) {}

	@Override public void info(Class<?> classname, String message) {}
	@Override public void debug(Class<?> classname, String message) {}
	@Override public void trace(Class<?> classname, String message) {}
	@Override public void fine(Class<?> classname, String message) {}
	@Override public void finer(Class<?> classname, String message) {}

	@Override public void info(String title, String message) {}
	@Override public void debug(String title, String message) {}
	@Override public void trace(String title, String message) {}
	@Override public void fine(String title, String message) {}
	@Override public void finer(String title, String message) {}

	@Override public void info(Class<?> classname, String title, String message) {}
	@Override public void debug(Class<?> classname, String title, String message) {}
	@Override public void trace(Class<?> classname, String title, String message) {}
	@Override public void fine(Class<?> classname, String title, String message) {}
	@Override public void finer(Class<?> classname, String title, String message) {}
	
}
