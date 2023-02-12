package com.bridgelabz;

public class MoodAnalyzerMain {
    private String messag
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
