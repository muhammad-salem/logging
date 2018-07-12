package org.log;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.log.core.LogFormate;
import org.log.core.Logger;

import org.terminal.Ansi;

public class SimpleLogger implements Logger{
	
	String app_name;
	PrintStream print;
	LogFormate formate;
	
	public SimpleLogger(String app_name, PrintStream print) {
		this.app_name = app_name;
		this.print = print;
		this.formate = new LogFormate() {
			
			@Override
			public void log(Level level, Class<?> classname, String title, String message) {
				simpleLog(level, classname, title, message);
			}
		};
	}
	public SimpleLogger(String app_name,PrintStream print, LogFormate formate) {
		this.app_name = app_name;
		this.print = print;
		this.formate = formate;
	}
	
    String messageFormate = "[{}]\t{}";
    String titleHeadFormate = "[{}]\t{} {";
    String titleBodyFormate = "[{}]\t\t{}";
    String titleFotterFormate = "[{}]\t }";
    
    public void setColourFormate(boolean useansicolour) {
    	if(useansicolour) {
    		messageFormate = "["+ansi.Red("{}")+"]\t"+ansi.BlueLight("{}");
    		titleHeadFormate = "[" + ansi.Red("{}") + "]\t" + ansi.BlueLight("{}") + ansi.Green("  {");
    		titleBodyFormate =  "["+ansi.Red("{}")+"]\t\t"+ansi.Green("{}"); // "[{}]\t\t{}";
    		titleFotterFormate = "[" + ansi.Red("{}") + "]\t " + ansi.Green("}");
    	}else {
    		messageFormate = "[{}]\t{}";
    		titleHeadFormate = "[{}]\t{} {";
    		titleBodyFormate = "[{}]\t\t{}";
    		titleFotterFormate = "[{}]\t }";
		}
    }

	/**
	 * used to show log in formate
	 * [time] level:appname:classname:title:message
	 */
	
	public void simpleLog(Level level, Class<?> classname, String title, String message) {
		StringBuilder log = new StringBuilder();
		log.append ( ansi.BlueLight( "( " + hhmmss() + " )") );
		log.append(' ');
		log.append("[ " + getStringMiddle(level.toAnsiString(), 25)   + " ] ");
		log.append(' ');
		log.append(ansi.Colour24("[ " + app_name + " ]", 119,41,83));
		log.append(' ');
		if(classname != null ) 
			log.append ( ansi.Yellow ("[ " + getStringMiddle(classname.getSimpleName(), 20)  + " ] ") );
		//else {
		//	log.append("[ " + getStringMiddle(" ", 20)  + " ] ");
		//}
		log.append(' ');
		if(title != null ) 
			log.append (  ansi.Green("[ " + getStringMiddle(title, 20)  + " ]") );
		//else {
		//	log.append("[ " + getStringMiddle(" ", 20)  + " ]");
		//}
		String line = log.toString();
		//log.append("{ " + message  + " } ");
		//print.println(log.toString());
		//message = line + ' ' + message.replace("\n", "\n" + line + " " );
		message = line +  ansi.MagentaLight(" {") 
				  +"\r\n\r\t" 
				  +  message.replace("\n", Ansi.EraseEndofLine + "\n" + Ansi.EraseLine + "\t" ) 
				  + ansi.MagentaLight("\n}") 
				  + Ansi.EraseEndofLine + '\n' + Ansi.EraseEndofLine;
		print.println(message);
		
	}


	@Override
	public LogFormate formate() {
		return formate;
	}
	

	public String getStringMiddle(String str, int count ) {
        if(str.length() > count) return str;
        int apend = (count - str.length())/2;
        boolean reminder = ((count - str.length())%2 ) == 1 ;
        if(reminder) str = str +' ' ;
        for (int i = 0; i < apend; i++) {
            str  = ' ' + str + ' ';
        }
        return str;
    }
	
	// Date format is Specified
	// "dd-MMM-yyyy hh:mm:ss a"; 
	
	String dateFormatString = "hh:mm:ss a"; //Date format is Specified
	SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormatString);
	
	public String hhmmss() {
		return hhmmss(System.currentTimeMillis());
	}
	public String hhmmss(final long millsecond) {
		return dateFormat.format(new Date(millsecond));
	}
	
	
	@Override
	public void log(Message message) {
		if(message == null) return;
		switch (message.getLevel()) {
		case debug:
			debug( message.getClassname(), message.getTitle(), message.getMessage());
			break;
		case warning:
			warning( message.getClassname(), message.getTitle(), message.getMessage());
			break;			
		case info:
			info( message.getClassname(), message.getTitle(), message.getMessage());
			break;
		case fine:
			fine( message.getClassname(), message.getTitle(), message.getMessage());
			break;
		case finer:
			finer( message.getClassname(), message.getTitle(), message.getMessage());
			break;
		case finest:
			finest( message.getClassname(), message.getTitle(), message.getMessage());
			break;
		case all:
			log(message.getLevel(), message.getClassname(), message.getTitle(), message.getMessage());
			break;
		case off: 
			break;
		default:
			print(message.getMessage());
		}
	}
	@Override
	public void print(String message) {
		print.print(message);
	}
	
	@Override
	public void println(String message) {
		print.println(message);
	}
}
