package com.example.DesignPatternDemo.BehavioralPatterns.MementoPattern;

public class MementoPatternDemo {
    public void execute() {
        System.out.println("---- MementoPatternDemo.execute ----");

        /*
            Intro:
                Memento design pattern lets you save and restore the previous state of an object without revealing
                the details of its implementation. But it must do this without violating Encapsulation.
                Such case is useful in case of error or failure.

                Undo or backspace or ctrl+z is one of the most used operation in an editor. Memento design pattern is
                used to implement the undo operation. This is done by saving the current state of the object as it
                changes state.

                The memento pattern has three participants.

                Originator – is the object that knows how to create and save it’s state for future. It provides methods
                    createMemento() and restore(memento).
                Caretaker – performs an operation on the Originator while having the possibility to rollback. It keeps
                    track of multiple mementos. Caretaker class refers to the Originator class for saving
                    (createMemento()) and restoring (restore(memento)) originator’s internal state.
                    A caretaker can keep track of the originator’s history by storing a stack of mementos.
                Memento – The Memento is a value object that acts as a snapshot of the originator’s state.
                    It’s a common practice to make the memento immutable and pass it the data only once, via the constructor.


            Example:
                In this example, we are creating memento for an Article object.

         */

        ArticleCaretaker articleCaretaker = new ArticleCaretaker();

        Article article = new Article(1, "New title 1");
        article.setContent("Content 1");
        System.out.println(article);
        saveArticle(article, articleCaretaker);

        article.setTitle("New Title 2");
        article.setContent("Content 2");
        System.out.println(article);
        saveArticle(article, articleCaretaker);

        article.setContent("Content 3");
        System.out.println(article);
        saveArticle(article, articleCaretaker);

        undoArticle(article, articleCaretaker);
        System.out.println(article);

        undoArticle(article, articleCaretaker);
        System.out.println(article);

        /*
            Usage:
                - Use the Memento pattern when you want to produce snap- shots of the object’s state to be able to
                restore a previous state of the object.

                - Use the pattern when direct access to the object’s fields/get- ters/setters violates its encapsulation.
                    The Memento makes the object itself responsible for creating a snapshot of its state. No other
                    object can read the snapshot, making the original object’s state data safe and secure.
         */
    }

    public void saveArticle(Article article, ArticleCaretaker articleCaretaker) {
        articleCaretaker.save(article.createMemento());
        System.out.println("Saved article");
    }

    public void undoArticle(Article article, ArticleCaretaker articleCaretaker) {
        article.restoreMemento(articleCaretaker.undo());
        System.out.println("Undo article");
    }

}
