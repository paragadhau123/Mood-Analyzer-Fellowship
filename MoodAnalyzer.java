package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
    public final String message;


    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood(String message) throws MoodAnalysisException {
        this.message = message;
        return analyseMood();
    }

    public String analyseMood() throws MoodAnalysisException() {
        try {
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            try {
                throw new MoodAnalysisException("Please enter Proper Mood");
            } catch (MoodAnalysisException moodAnalysisException) {
                moodAnalysisException.printStackTrace();
            }
        }
    }
}
