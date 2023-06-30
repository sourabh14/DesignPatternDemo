package com.example.DesignPatternDemo.BehavioralPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsEventManager {
    private List<NewsEventListener> newsEventListenerList = new ArrayList<>();

    public void subscribe(NewsEventListener listener) {
        newsEventListenerList.add(listener);
    }

    public void unsubscribe(NewsEventListener listener) {
        newsEventListenerList.remove(listener);
    }

    public void notifyListeners(String news) {
        for (NewsEventListener listener : newsEventListenerList) {
            listener.update(news);
        }
    }

    public void showSubscribers() {
        System.out.print("Subscriber list: [");
        for (NewsEventListener listener : newsEventListenerList) {
            System.out.print(listener.getName() + ", ");
        }
        System.out.println("]");
    }
}
