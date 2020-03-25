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
}
