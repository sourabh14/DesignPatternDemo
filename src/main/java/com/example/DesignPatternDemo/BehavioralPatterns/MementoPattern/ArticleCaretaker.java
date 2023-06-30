package com.example.DesignPatternDemo.BehavioralPatterns.MementoPattern;

import java.util.ArrayList;
import java.util.List;

public class ArticleCaretaker {
    private List<ArticleMemento> mementoList = new ArrayList<>();

    public void save(ArticleMemento articleMemento) {
        mementoList.add(articleMemento);
    }

    public ArticleMemento undo() {
        mementoList.remove(mementoList.size() - 1);
        return mementoList.get(mementoList.size() - 1);
    }
}
