package com.example.DesignPatternDemo.BehavioralPatterns.ObserverPattern;

public class NewsAgency {
    private String news;
    private NewsEventManager newsEventManager;

    public NewsAgency(NewsEventManager newsEventManager) {
        this.newsEventManager = newsEventManager;
    }

    public void setNews(String news) {
        this.news = news;
        newsEventManager.notifyListeners(news);
    }
}
