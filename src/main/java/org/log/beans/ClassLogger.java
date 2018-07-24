package org.log.beans;

import java.io.PrintStream;

import org.log.interfae.ClassLogging;
import org.log.interfae.LogFormater;

public class ClassLogger implements ClassLogging {

	private Class<?> classlog;
	private LogFormater logFormate;
	
	public ClassLogger(Class<?> classLog) {
		this.classlog = classLog;
		this.logFormate = LogFormater.DefaultFormater;
	}
	public ClassLogger(Class<?> classLog, PrintStream printStream) {
		this.classlog = classLog;
		this.logFormate = LogFormater.getDefaultFormater(printStream);
	}
	public ClassLogger(Class<?> classLog, LogFormater logFormate) {
		this.classlog = classLog;
		this.logFormate = logFormate;
		
	}
	@Override
	public Class<?> getObjectClass() {
		return classlog;
	}
	@Override
	public LogFormater formater() {
		return logFormate;
	}
	

}
