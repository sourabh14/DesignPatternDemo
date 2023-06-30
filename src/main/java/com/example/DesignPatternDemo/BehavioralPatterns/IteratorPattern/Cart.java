package com.example.DesignPatternDemo.BehavioralPatterns.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cart {
    private List<Product> productList;

    public Cart() {
        productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public Iterator<Product> getIterator() {
        return new CartIterator();
    }

    class CartIterator implements Iterator<Product> {
        int currentPosition = 0;

        @Override
        public boolean hasNext() {
            return currentPosition < productList.size();
        }

        @Override
        public Product next() {
            Product product = productList.get(currentPosition);
            currentPosition++;
            return product;
        }

        @Override
        public void remove() {
            currentPosition--;
            productList.remove(currentPosition);
        }

    }

 }
