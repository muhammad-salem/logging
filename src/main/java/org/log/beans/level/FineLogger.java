package org.log.beans.level;

import java.io.PrintStream;

import org.log.beans.Logger;
import org.log.interfae.LogFormater;

public class FineLogger extends Logger {

	public FineLogger(PrintStream print) {
		super(print);
	}
	
	public FineLogger(LogFormater formate) {
		super(formate);
	}

	@Override public void finer(String message) {}

	@Override public void finer(Class<?> classname, String message) {}

	@Override public void finer(String title, String message) {}

	@Override public void finer(Class<?> classname, String title, String message) {}
	
}
