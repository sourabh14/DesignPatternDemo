package com.example.DesignPatternDemo.BehavioralPatterns.MementoPattern;

// Originator class
public class Article {
    private int id;
    private String title;
    private String content;

    public Article(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ArticleMemento createMemento() {
        return new ArticleMemento(this.id, this.title, this.content);
    }

    public void restoreMemento(ArticleMemento memento) {
        this.id = memento.getId();
        this.title = memento.getTitle();
        this.content = memento.getContent();
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
