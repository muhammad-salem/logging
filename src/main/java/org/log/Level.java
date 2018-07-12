package org.log;

import org.terminal.Ansi;

public enum Level {
	 off, debug, warning, info, fine, finer, finest, all;
	
	Ansi ansi = new Ansi();
	public String toAnsiString() {
		switch (this) {
		case debug:
			return  ansi.Blue(ansi.Underscore(name()));
		case warning:
			return  ansi.RedLightbg(ansi.Underscore(name()));
		case info:
			return  ansi.Green(ansi.Underscore(name()));
		case fine:
			return  ansi.GreenLight(ansi.Underscore(name()));
		case finer:
			return  ansi.Yellow(ansi.Underscore(name()));
		case finest:
			return  ansi.YellowLight(ansi.Underscore(name()));
		case all:
			return  ansi.CyanLight(ansi.Underscore(name()));
		case off:	
		default:
			return name();
		}
	}
}
