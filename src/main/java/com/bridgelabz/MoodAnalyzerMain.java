package com.bridgelabz;

public class MoodAnalyzerMain {
    // Constructor
    private String message;

    // Constructor
    public MoodAnalyzerMain() {
    }

    public MoodAnalyzerMain(String message) {
        this.message = message;
    }

    public String analyseMood() {
        try {
            if (this.message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}
