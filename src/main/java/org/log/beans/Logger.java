package org.log.beans;

import java.io.PrintStream;

import org.log.interfae.LogFormater;
import org.log.interfae.LoggingInterface;

public class Logger implements LoggingInterface{

	protected LogFormater logFormate;
	public Logger() {
		this(LogFormates.getDefaultFormat(System.out));
	}
	public Logger(PrintStream printStream) {
		this(LogFormates.getDefaultFormat(printStream));
	}
	public Logger(LogFormater logFormate) {
		this.logFormate = logFormate;
	}


	@Override
	public LogFormater formater() {
		return logFormate;
	}
	

}
