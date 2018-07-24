package org.slf4j.impl;

import org.log.beans.Level;
import org.log.beans.Logger;
import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MarkerIgnoringBase;
import org.slf4j.helpers.MessageFormatter;

public class SimpleAnsiLogger extends MarkerIgnoringBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5939577282609304636L;

	Level level;
	Logger logger;
	SimpleAnsiLogger(Class<?> cname) {
        this(cname.getName());
    }
	
	SimpleAnsiLogger(String name) {
        this(name, Level.debug);
    }
	SimpleAnsiLogger(String name, org.slf4j.event.Level level) {
        this(name, Level.values()[level.ordinal()+1]);
    }
	SimpleAnsiLogger(String name, Level level) {
        this.name = name;
        this.level = level;
        logger = new Logger();
    }

	private boolean isLevelEnabled(Level l) {
		logger.error(l.toString());
		return l.ordinal() <= level.ordinal();
	}
	
	@Override
	public boolean isTraceEnabled() {
		return isLevelEnabled(Level.trace);
	}

	@Override
	public void trace(String msg) {
		logger.trace(name, msg);
	}

	@Override
	public void trace(String format, Object arg) {
		FormattingTuple tp = MessageFormatter.format(format, arg);
		logger.trace(name, tp.getMessage());
	}

	@Override
	public void trace(String format, Object arg1, Object arg2) {
		FormattingTuple tp = MessageFormatter.format(format, arg1, arg2);
		logger.trace(name, tp.getMessage());
	}

	@Override
	public void trace(String format, Object... arguments) {
		FormattingTuple tp = MessageFormatter.format(format, arguments);
		logger.trace(name, tp.getMessage());
	}

	@Override
	public void trace(String msg, Throwable t) {
		logger.trace(name, msg + '\n' + t.getMessage());
	}

	@Override
	public boolean isDebugEnabled() {
		return isLevelEnabled(Level.debug);
	}

	@Override
	public void debug(String msg) {
		logger.debug(name, msg);
	}

	@Override
	public void debug(String format, Object arg) {
		FormattingTuple tp = MessageFormatter.format(format, arg);
		logger.debug(name, tp.getMessage());
	}

	@Override
	public void debug(String format, Object arg1, Object arg2) {
		FormattingTuple tp = MessageFormatter.format(format, arg1, arg2);
		logger.debug(name, tp.getMessage());
	}

	@Override
	public void debug(String format, Object... arguments) {
		FormattingTuple tp = MessageFormatter.format(format, arguments);
		logger.debug(name, tp.getMessage());
	}

	@Override
	public void debug(String msg, Throwable t) {
		logger.debug(name, msg + '\n' + t.getMessage());
	}

	@Override
	public boolean isInfoEnabled() {
		return isLevelEnabled(Level.info);
	}

	@Override
	public void info(String msg) {
		logger.info(name, msg);
	}

	@Override
	public void info(String format, Object arg) {
		FormattingTuple tp = MessageFormatter.format(format, arg);
		logger.info(name, tp.getMessage());
	}

	@Override
	public void info(String format, Object arg1, Object arg2) {
		FormattingTuple tp = MessageFormatter.format(format, arg1,arg2);
		logger.info(name, tp.getMessage());
		
	}

	@Override
	public void info(String format, Object... arguments) {
		FormattingTuple tp = MessageFormatter.format(format, arguments);
		logger.info(name, tp.getMessage());
	}

	@Override
	public void info(String msg, Throwable t) {
		logger.info(name, msg + '\n' + t.getMessage());
		
	}

	@Override
	public boolean isWarnEnabled() {
		return isLevelEnabled(Level.warn);
	}

	@Override
	public void warn(String msg) {
		logger.warn(name, msg);
		
	}

	@Override
	public void warn(String format, Object arg) {
		FormattingTuple tp = MessageFormatter.format(format, arg);
		logger.warn(name, tp.getMessage());
	}

	@Override
	public void warn(String format, Object... arguments) {
		FormattingTuple tp = MessageFormatter.format(format, arguments);
		logger.warn(name, tp.getMessage());
	}

	@Override
	public void warn(String format, Object arg1, Object arg2) {
		FormattingTuple tp = MessageFormatter.format(format, arg1, arg2);
		logger.warn(name, tp.getMessage());
	}

	@Override
	public void warn(String msg, Throwable t) {
		logger.warn(name, msg + '\n' + t.getMessage());
	}

	@Override
	public boolean isErrorEnabled() {
		return isLevelEnabled(Level.error);
	}

	@Override
	public void error(String msg) {
		logger.error(name, msg);
	}

	@Override
	public void error(String format, Object arg) {
		FormattingTuple tp = MessageFormatter.format(format, arg);
		logger.error(name, tp.getMessage());
		
	}

	@Override
	public void error(String format, Object arg1, Object arg2) {
		FormattingTuple tp = MessageFormatter.format(format, arg1, arg2);
		logger.error(name, tp.getMessage());
	}

	@Override
	public void error(String format, Object... arguments) {
		FormattingTuple tp = MessageFormatter.format(format, arguments);
		logger.error(name, tp.getMessage());
	}

	@Override
	public void error(String msg, Throwable t) {
		logger.warn(name, msg + '\n' + t.getMessage());
	}

}
