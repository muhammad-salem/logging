package org.log.beans;

import org.junit.BeforeClass;
import org.junit.Test;
import org.log.concurrent.Log;
import org.terminal.beans.Table;

public class LoggerTest {

	static ClassLogger logger;
	
	@BeforeClass
	public static void initLogger() {
		logger = new ClassLogger(LoggerTest.class);
	}
	
	@Test
	public void loggerTest() {
		logger.error("Error", "message");
	}

	@Test
	public void test() {
		Log.level(Level.all);
		Log.info(getClass(), "Test#2","error");
		
		Table<Character> table = new Table<>(3);
		table.addRow('O', 'X', 'X');
		table.addRow('X', 'O', 'X');
		table.addRow('X', 'X', 'O');
		
		Logger log = new Logger(System.out);
		log.info( getClass(), "Test#1", "hi\nhow are you");
		log.fine(getClass(), "Test#2", "hi\nhow are you\nhad lunch");
//		//fail("Not yet implemented");
		
		log.info(table.toString());
		
	}
	
	@Test
	public void tryTable() {
		Log.level(Level.info);
		Log.error(getClass(), "Test#2","حماده بالجنزبيل");
		
		Table<Character> table = new Table<>(3);
		table.addRow('O', 'X', 'X');
		table.addRow('X', 'O', 'X');
		table.addRow('X', 'X', 'O');
		
		Log.info("TaBle",table.toString());
		
//		ClassLogger logger = new ClassLogger(Main.class);
//		logger.error("TableA", table.toString());
//		logger.debug("title", "message");
		
		LevelLogger levelLogger = new LevelLogger();
		levelLogger.info(table.toString());
		
		Log.stopLogging();

	}
	
}
