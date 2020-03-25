package org.log.beans;

import java.io.PrintStream;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import org.log.interfae.LogFormater;
import org.terminal.Ansi;

public class DefaultFormater  implements LogFormater {
	private static final String NEW_LINE = Ansi.EraseEndofLine + "\n" + Ansi.EraseLine + "  ";
	
	private String dateFormatString = "hh:mm:ss a";
	private SimpleDateFormat dateFormat =new SimpleDateFormat(dateFormatString);
	private MessageFormat fullFormat = new MessageFormat(getFullPattern());
	private MessageFormat messageFormat = new MessageFormat(getMessagePattern());
	private MessageFormat noTitleFormat = new MessageFormat(getNoTitlePattern());
	private MessageFormat noClassFormat = new MessageFormat(getNoClassPattern());
	
	private PrintStream printStream;
	public DefaultFormater(PrintStream printStream) {
		this.printStream = printStream;
	}
	
	@Override
	public void log(Message message) {
		if(Objects.isNull(message.classname()) && Objects.isNull(message.title())) {
			logMessage(message);
		}
		else if(Objects.isNull(message.title())) {
			logNoTitle(message);
		}
		else if(Objects.isNull(message.classname())) {
			logNoClass(message);
		}else {
			logfull(message);
		}
	}
	
	
	public void logMessage(Message message) {
		String msg = message.message().replace("\n", NEW_LINE);
		Object[] args = { hhmmss(), message.level(),  msg };
		printStream.println( messageFormat.format(args) );
	}
	private String getMessagePattern() {
		Ansi ansi = new Ansi();
		StringBuilder log = new StringBuilder();
		log.append( Ansi.EraseEndofLine + ansi.blueLight( "( {0} )") );
		log.append(' ');
		log.append( color24(("[ {1} ]"),  119,41,83) );
		log.append(' ');
		log.append( magentaLight("'{'\n")  + EraseEndofLine + "  " );
		log.append( "{2}" );
		log.append( magentaLight("\n'}'") + EraseEndofLine );
		return log.toString();
	}
	
	public void logNoTitle(Message message) {
		String msg = message.message().replace("\n", NEW_LINE);
		Object[] args = { hhmmss(), message.level(), message.classname() , message.title(), msg };
		printStream.println( noTitleFormat.format(args) );
	}
	private String getNoTitlePattern() {
		Ansi ansi = new Ansi();
		StringBuilder log = new StringBuilder();
		log.append( EraseEndofLine + ansi.blueLight( "( {0} )") );
		log.append(' ');
		log.append( color24(("[ {1} ]"),  119,41,83) );
		log.append(' ');
		log.append( yellow ("[ {2} ]") );
		log.append( magentaLight(" '{'\n")  + EraseEndofLine + "  " );
		log.append( "{3}" );
		log.append( magentaLight("\n'}'") + EraseEndofLine );
		return log.toString();
	}
	
	public void logNoClass(Message message) {
		String msg = message.message().replace("\n", NEW_LINE);
		Object[] args = { hhmmss(), message.level(), message.title(), msg };
		printStream.println( noClassFormat.format(args) );
	}
	private String getNoClassPattern() {
		StringBuilder log = new StringBuilder();
		log.append( EraseEndofLine + blueLight( "( {0} )") );
		log.append(' ');
		log.append( color24(("[ {1} ]"),  119,41,83) );
		log.append(' ');
		log.append( green("[ {2} ]") );
		log.append( magentaLight(" '{'\n")  + EraseEndofLine + "  " );
		log.append( "{3}" );
		log.append( magentaLight("\n'}'") + EraseEndofLine );
		return log.toString();
	}
	
	public void logfull(Message message) {
		String msg = message.message().replace("\n", NEW_LINE);
		Object[] args = { hhmmss(), message.level(), message.classname() , message.title(), msg };
		printStream.println( fullFormat.format(args) );
	}
	private String getFullPattern() {
		StringBuilder log = new StringBuilder();
		log.append( EraseEndofLine + blueLight( "( {0} )") );
		log.append(' ');
		log.append( color24(("[ {1} ]"),  119,41,83) );
		log.append(' ');
		log.append( yellow ("[ {2} ]") );
		log.append(' ');
		log.append( green("[ {3} ]") );
		log.append( magentaLight(" '{'\n")  + EraseEndofLine + "  " );
		log.append( "{4}" );
		log.append( magentaLight("\n'}'") + EraseEndofLine );
		return log.toString();
	}
	
	
	
	private String hhmmss() {
		return hhmmss(System.currentTimeMillis());
	}

	private String hhmmss(final long millsecond) {
		return dateFormat.format(new Date(millsecond));
	}

}
