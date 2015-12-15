package com.sentinel.engine.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sentinel.engine.constants.ParserConstants;

public class YoutubeParserServiceImpl extends YoutubeParserService {

	@Override
	public String getVideoID(String url) {
		String pattern = ParserConstants.YOUTUBEPARSER.getRegexp();
		Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(url);
        if (matcher.find()) {
             return matcher.group();
        }
        return null;
	}

}
