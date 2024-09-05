package com.example.DesignPatternDemo.BehavioralPatterns.CommandPattern;

public class SaveTextFileCommand implements TextFileCommand {
    private TextFile textFile;

    public SaveTextFileCommand(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        textFile.save();
    }
}
