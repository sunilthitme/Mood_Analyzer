package com.blz.moodAnalyzer;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyzerTest {
	    @Test
	    public void givenMessage_SadMood_Should_Return_Sad() {
	        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am In a Sad Mood");
	        String mood = moodAnalyzer.analyseMood();
	        assertEquals("SAD", mood);
	    }
	    @Test
	    public void givenMessage_HappyMood_Should_Return_Happy() {
	        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am In a Happy Mood");
	        String mood = moodAnalyzer.analyseMood();
	        assertEquals("HAPPY", mood);
	    }
}

