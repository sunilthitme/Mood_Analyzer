package com.blz.moodAnalyzer;

	public class MoodAnalysisException extends RuntimeException {
	    public Exception_Type type;

	    public MoodAnalysisException(String message, Exception_Type type) {
	        super(message);
	        this.type = type;
	    }

	    public enum Exception_Type {
	        NULL, EMPTY;
	    }
}
