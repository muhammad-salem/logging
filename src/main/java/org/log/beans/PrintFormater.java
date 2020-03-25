package org.log.beans;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import org.log.interfae.LogFormater;
import org.terminal.Ansi;

public class PrintFormater implements LogFormater {
	private static final String NEW_LINE = Ansi.EraseEndofLine + "\n" + Ansi.EraseLine + "  ";

	
	private PrintStream printStream;
	public PrintFormater(PrintStream printStream) {
		this.printStream = printStream;
	}
	
	private String dateFormatString = "hh:mm:ss a";
	private SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormatString);

	private String hhmmss() {
		return hhmmss(System.currentTimeMillis());
	}

	private String hhmmss(final long millsecond) {
		return dateFormat.format(new Date(millsecond));
	}
	
	@Override
	public void log(Message message) {
		printStream.print(EraseEndofLine);
		printStream.print(blueLight( "( " + hhmmss() + " )"));
		printStream.print(' ');
		printStream.print(color24(("[ " + message.level() + " ]"),  119,41,83));
		printStream.print(' ');
		if (Objects.nonNull(message.classname())) {
			printStream.print(yellow ("[ " + message.classname() + " ]"));
			printStream.print(' ');
		}
		if(Objects.nonNull(message.title())) {
			printStream.print(green("[ " + message.title() + " ]"));
		}
		
		printStream.print(magentaLight(" {\n"));
		printStream.print(EraseEndofLine);
		printStream.print("  ");
		String msg = message.message();
		char c = ' ';
		for (int i = 0; i < msg.length(); i++) {
			c = msg.charAt(i);
			if (c == '\n') {
				printStream.print(NEW_LINE);
			} else {
				printStream.print(c);
			}
		}
		printStream.print(magentaLight("\n}"));
		printStream.print(EraseEndofLine);
		printStream.println();
	}

}
