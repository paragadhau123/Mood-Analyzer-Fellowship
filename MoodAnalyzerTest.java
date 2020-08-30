package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    private String message;

    @Test
    public void givenMessgae_WhenSad_ShouldReturn_Sad() {
        com.bridgelabz.moodanalyzer.MoodAnalyzer moodAnalyzer = new com.bridgelabz.moodanalyzer.MoodAnalyzer(message);
        String mood = moodAnalyzer.analyseMood("This is a Sad Message");
        Assert.assertEquals("SAD", mood);

    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturn_Happy() {
        com.bridgelabz.moodanalyzer.MoodAnalyzer moodAnalyzer = new com.bridgelabz.moodanalyzer.MoodAnalyzer(message);
        String mood = moodAnalyzer.analyseMood("This is Happy Messgae");
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenNullMood_ShouldReturn_Happy() {
        com.bridgelabz.moodanalyzer.MoodAnalyzer moodAnalyzer = new com.bridgelabz.moodanalyzer.MoodAnalyzer(null);
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
}