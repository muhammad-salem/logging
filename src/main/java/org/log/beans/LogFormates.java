package org.log.beans;

import java.io.PrintStream;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.log.interfae.LogFormater;
import org.terminal.Ansi;

public class LogFormates {
	
	public static final LogFormater DefaultFormater = getDefaultFormat(System.out);
	
	public static LogFormater getDefaultFormat(PrintStream printStream) {
		return new LogFormater() {
			// Date format is Specified
			// "dd-MMM-yyyy hh:mm:ss a";

			private String dateFormatString = "hh:mm:ss a";
			private SimpleDateFormat dateFormat =new SimpleDateFormat(dateFormatString);
			private MessageFormat fullFormat = new MessageFormat(getFullPattern());
			private MessageFormat messageFormat = new MessageFormat(getMessagePattern());
			private MessageFormat noTitleFormat = new MessageFormat(getNoTitlePattern());
			private MessageFormat noClassFormat = new MessageFormat(getNoClassPattern());
			
			@Override
			public void log(Message message) {
//				String msg = message.getMessage().replace("\n", Ansi.EraseEndofLine + "\n" + Ansi.EraseLine + "  ");
//				Object[] args = { hhmmss(), message.level(), message.classname() , message.getTitle(), msg };
//				printStream.println( fullFormat.format(args) );
				
				if(message.getTitle().equals("") & message.getClassname() == null ) {
					logMessage(message);
				}
				else if(message.getTitle().equals("")) {
					logNoTitle(message);
				}
				else if(message.getClassname() == null) {
					logNoClass(message);
				}else {
					logfull(message);
				}
			}
			
			
			public void logMessage(Message message) {
				String msg = message.getMessage().replace("\n", Ansi.EraseEndofLine + "\n" + Ansi.EraseLine + "  ");
				Object[] args = { hhmmss(), message.level(),  msg };
				printStream.println( messageFormat.format(args) );
			}
			private String getMessagePattern() {
				Ansi ansi = new Ansi();
				StringBuilder log = new StringBuilder();
				log.append( Ansi.EraseEndofLine + ansi.blueLight( "( {0} )") );
				log.append(' ');
				log.append( ansi.color24(("[ {1} ]"),  119,41,83) );
				log.append(' ');
				log.append( ansi.magentaLight("'{'\n")  + Ansi.EraseEndofLine + "  " );
				log.append( "{2}" );
				log.append( ansi.magentaLight("\n'}'") + Ansi.EraseEndofLine );
				return log.toString();
			}
			
			public void logNoTitle(Message message) {
				String msg = message.getMessage().replace("\n", Ansi.EraseEndofLine + "\n" + Ansi.EraseLine + "  ");
				Object[] args = { hhmmss(), message.level(), message.classname() , message.getTitle(), msg };
				printStream.println( noTitleFormat.format(args) );
			}
			private String getNoTitlePattern() {
				Ansi ansi = new Ansi();
				StringBuilder log = new StringBuilder();
				log.append( Ansi.EraseEndofLine + ansi.blueLight( "( {0} )") );
				log.append(' ');
				log.append( ansi.color24(("[ {1} ]"),  119,41,83) );
				log.append(' ');
				log.append( ansi.yellow ("[ {2} ]") );
				log.append( ansi.magentaLight(" '{'\n")  + Ansi.EraseEndofLine + "  " );
				log.append( "{3}" );
				log.append( ansi.magentaLight("\n'}'") + Ansi.EraseEndofLine );
				return log.toString();
			}
			
			public void logNoClass(Message message) {
				String msg = message.getMessage().replace("\n", Ansi.EraseEndofLine + "\n" + Ansi.EraseLine + "  ");
				Object[] args = { hhmmss(), message.level(), message.getTitle(), msg };
				printStream.println( noClassFormat.format(args) );
			}
			private String getNoClassPattern() {
				Ansi ansi = new Ansi();
				StringBuilder log = new StringBuilder();
				log.append( Ansi.EraseEndofLine + ansi.blueLight( "( {0} )") );
				log.append(' ');
				log.append( ansi.color24(("[ {1} ]"),  119,41,83) );
				log.append(' ');
				log.append( ansi.green("[ {2} ]") );
				log.append( ansi.magentaLight(" '{'\n")  + Ansi.EraseEndofLine + "  " );
				log.append( "{3}" );
				log.append( ansi.magentaLight("\n'}'") + Ansi.EraseEndofLine );
				return log.toString();
			}
			
			public void logfull(Message message) {
				String msg = message.getMessage().replace("\n", Ansi.EraseEndofLine + "\n" + Ansi.EraseLine + "  ");
				Object[] args = { hhmmss(), message.level(), message.classname() , message.getTitle(), msg };
				printStream.println( fullFormat.format(args) );
			}
			private String getFullPattern() {
				Ansi ansi = new Ansi();
				StringBuilder log = new StringBuilder();
				log.append( Ansi.EraseEndofLine + ansi.blueLight( "( {0} )") );
				log.append(' ');
				log.append( ansi.color24(("[ {1} ]"),  119,41,83) );
				log.append(' ');
				log.append( ansi.yellow ("[ {2} ]") );
				log.append(' ');
				log.append( ansi.green("[ {3} ]") );
				log.append( ansi.magentaLight(" '{'\n")  + Ansi.EraseEndofLine + "  " );
				log.append( "{4}" );
				log.append( ansi.magentaLight("\n'}'") + Ansi.EraseEndofLine );
				return log.toString();
			}
			
			
			
			private String hhmmss() {
				return hhmmss(System.currentTimeMillis());
			}

			private String hhmmss(final long millsecond) {
				return dateFormat.format(new Date(millsecond));
			}
		};
	}
	
}
