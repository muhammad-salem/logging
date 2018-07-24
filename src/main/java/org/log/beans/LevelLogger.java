package org.log.beans;

import java.io.PrintStream;

import org.log.interfae.LogFormater;
import org.log.interfae.LoggingLevel;

public class LevelLogger extends Logger implements LoggingLevel{


	private Level level;
	
	/**
	 * create default info -> level, System.out -> printStream.
	 */
	public LevelLogger() {
		this(Level.info, LogFormates.getDefaultFormat(System.out));
	}
	public LevelLogger(Level level) {
		this(level, LogFormates.getDefaultFormat(System.out));
	}
	public LevelLogger(Level level, PrintStream printStream) {
		this(level, LogFormates.getDefaultFormat(printStream));
	}
	public LevelLogger(Level level, LogFormater logFormate) {
		this.level = level;
		this.logFormate = logFormate;
	}


	@Override
	public LogFormater formater() {
		return logFormate;
	}
	@Override
	public Level getLevel() {
		return level;
	}
	

}
