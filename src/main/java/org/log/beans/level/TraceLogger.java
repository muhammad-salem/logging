package org.log.beans.level;

import java.io.PrintStream;

import org.log.beans.Logger;
import org.log.interfae.LogFormater;

public class TraceLogger extends Logger {

	public TraceLogger(PrintStream print) {
		super(print);
	}
	
	public TraceLogger(LogFormater formate) {
		super(formate);
	}

	@Override public void fine(String message) {}
	@Override public void finer(String message) {}

	@Override public void fine(Class<?> classname, String message) {}
	@Override public void finer(Class<?> classname, String message) {}

	@Override public void fine(String title, String message) {}
	@Override public void finer(String title, String message) {}

	@Override public void fine(Class<?> classname, String title, String message) {}
	@Override public void finer(Class<?> classname, String title, String message) {}
	
}
