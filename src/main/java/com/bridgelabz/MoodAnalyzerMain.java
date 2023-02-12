package com.bridgelabz;

public class MoodAnalyzerMain {
    // Constructor
    private String message;

    // Constructor
    public MoodAnalyzerMain(){
    }
    public  MoodAnalyzerMain(String message) {
        this.message=message;
    }

    public String analyseMood() {
        if (this.message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}

