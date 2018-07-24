package org.log.interfae;

import org.log.beans.Level;
import org.log.beans.Message;

public interface LoggingLevel extends Logging{
	
	Level getLevel();
	

	/**
	 * @param level
	 * @return
	 */
	default boolean isLevelEnbled(Level level) {
		return level.ordinal() <= getLevel().ordinal();
	}
	
	default void log(Level level, String message) {
		if(isLevelEnbled(level))
			log(level, null, "", message);
	}
	
	default void log(Level level, Class<?> classname, String message) {
		if(isLevelEnbled(level))
			formater().log(level, classname, "", message);
	}
	
	default void log(Level level, Class<?> classname, String title, String message) {
		if(isLevelEnbled(level))
			formater().log(level, classname, title, message);
	}
	
	default void log(Message message) {
		if(message.getLevel().ordinal() <= getLevel().ordinal())
			formater().log(message);
	}
	
	
}
