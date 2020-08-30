package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyzerTest {
    private String message;

    @Test
    public void givenMessgae_WhenSad_ShouldReturn_Sad() {
        com.bridgelabz.moodanalyzer.MoodAnalyzer moodAnalyzer = new com.bridgelabz.moodanalyzer.MoodAnalyzer("I am in Sad Mood");
        String mood = null;
        try {
            mood = moodAnalyzer.analyseMood();
            Assert.assertEquals("SAD",mood);
        } catch (MoodAnalysisException e) {
        }
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturn_Happy() {
        com.bridgelabz.moodanalyzer.MoodAnalyzer moodAnalyzer = new com.bridgelabz.moodanalyzer.MoodAnalyzer("I am in any Mood");
        String mood = null;
        try {
            mood = moodAnalyzer.analyseMood();
            Assert.assertEquals("HAPPY",mood);
        } catch (MoodAnalysisException e) {
        }
    }

    @Test
    public void givenNullMood_ShouldReturn_Happy() {
        String mood = null;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            com.bridgelabz.moodanalyzer.MoodAnalyzer moodAnalyzer;
            mood = moodAnalyzer.analyseMood();
            Assert.assertEquals("HAPPY",mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenNullMood_ShouldThrow_Exception() {
        com.bridgelabz.moodanalyzer.MoodAnalyzer moodAnalyzer = new com.bridgelabz.moodanalyzer.MoodAnalyzer(null);
        try {
            moodAnalyzer.analyseMood(null);
        } catch (MoodAnalysisException e) {
            Assert.assertEquals("Please enter Proper Mood",e.getMessage());
        }
    }
}