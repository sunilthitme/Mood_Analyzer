package com.blz.moodAnalyzer;

public class MoodAnalyzer {
	    private String message;


	    public MoodAnalyzer() {
	    }

	    public MoodAnalyzer(String message) {
	        this.message = message;
	    }
	    public String analyseMood() {
	        if (this.message.contains("Sad"))
	            return "SAD";
	        else
	            return "HAPPY";
	    }
}

