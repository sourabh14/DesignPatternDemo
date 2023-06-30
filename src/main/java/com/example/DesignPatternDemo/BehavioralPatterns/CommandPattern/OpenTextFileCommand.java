package com.example.DesignPatternDemo.BehavioralPatterns.CommandPattern;

// Concrete command
public class OpenTextFileCommand implements TextFileCommand {
    private TextFile textFile;

    public OpenTextFileCommand(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        textFile.open();
    }
}
