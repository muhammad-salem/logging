package org.log.beans;

import java.io.PrintStream;

import org.log.beans.level.*;
import org.log.interfae.LogFormater;

public enum Level {
	off, error, warn, info, debug, trace, fine, finer, all;
	
	public Logger newLogger(PrintStream print) {
		switch (this) {
			case off:
				return new OffLogger(print);
			case error:
				return new ErrorLogger(print);
			case warn:
				return new WarningLogger(print);
			case info:
				return new InfoLogger(print);
			case debug:
				return new DebugLogger(print);
			case trace:
				return new TraceLogger(print);
			case fine:
				return new FineLogger(print);
			case finer:
			case all:
			default:
				return new FinerLogger(print);
		}
	}
	
	public  Logger newLogger(LogFormater formater) {
		switch (this) {
			case off:
				return new OffLogger(formater);
			case error:
				return new ErrorLogger(formater);
			case warn:
				return new WarningLogger(formater);
			case info:
				return new InfoLogger(formater);
			case debug:
				return new DebugLogger(formater);
			case trace:
				return new TraceLogger(formater);
			case fine:
				return new FineLogger(formater);
			case finer:
			case all:
			default:
				return new FinerLogger(formater);
		}
	}
	
}
