package org.log.interfae;

import java.io.PrintStream;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.log.beans.Level;
import org.log.beans.Message;
import org.terminal.Ansi;
import org.terminal.ansi.Colors;
import org.terminal.ansi.ErasingText;

public interface LogFormater extends Colors, ErasingText  {
	
	public static final LogFormater DefaultFormater = getDefaultFormater(System.out);
	
	public static LogFormater getDefaultFormater(PrintStream printStream) {
		return new LogFormater() {
			
			
			
			// Date format is Specified
				// "dd-MMM-yyyy hh:mm:ss a";

			private String dateFormatString = "hh:mm:ss a";
			private SimpleDateFormat dateFormat =new SimpleDateFormat(dateFormatString);
			private MessageFormat messageFormat = new MessageFormat(getMessagePattern());
			
			@Override
			public void log(Message message) {
				String msg = message.message().replace("\n", Ansi.EraseEndofLine + "\n" + Ansi.EraseLine + "  ");
				Object[] args = { hhmmss(), message.level(), message.classname() , message.title(), msg };
				printStream.println( messageFormat.format(args) );
			}
			private String getMessagePattern() {
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
	
	void log(Message message);
	default void log(Level level, Class<?> classname, String title, String message) {
		log(new Message(level, classname, title, message));
	}
	
	
}
