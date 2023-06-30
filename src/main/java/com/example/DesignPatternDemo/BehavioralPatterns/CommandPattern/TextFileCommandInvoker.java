package com.example.DesignPatternDemo.BehavioralPatterns.CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class TextFileCommandInvoker {

    private List<TextFileCommand> textFileCommandList = new ArrayList<>();

    public void executeCommand(TextFileCommand command) {
        textFileCommandList.add(command);
        command.execute();
    }
}
