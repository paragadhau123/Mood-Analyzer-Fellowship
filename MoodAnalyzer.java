package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
    private final String message;


    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}