package com.example.DesignPatternDemo.BehavioralPatterns.MementoPattern;

// Memento class - similar to Article class
public class ArticleMemento {
    private int id;
    private String title;
    private String content;

    public ArticleMemento(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
