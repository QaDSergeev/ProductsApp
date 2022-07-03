package ru.netology.product;

public class Book extends Product {
    private final String author;

    public Book(String name, int cost, String author) {
        super(name, cost);
        this.author = author;
    }
}
