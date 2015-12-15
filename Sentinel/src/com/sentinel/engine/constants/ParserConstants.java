package com.sentinel.engine.constants;

public enum ParserConstants {
	YOUTUBEPARSER ("(?<=watch\\?v=|/videos/|embed\\/|youtu.be\\/|\\/v\\/|\\/e\\/|watch\\?v%3D|watch\\?feature=player_embedded&v=|%2Fvideos%2F|embed%\u200C\u200B2F|youtu.be%2F|%2Fv%2F)[^#\\&\\?\\n]*");
	private final String regexp;
	
	private ParserConstants(String regexp){
		this.regexp = regexp;
	}
	
	public String getRegexp(){
		return this.regexp;
	}
	
}
