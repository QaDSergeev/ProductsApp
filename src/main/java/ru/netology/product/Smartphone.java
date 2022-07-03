package ru.netology.product;

public class Smartphone extends Product {

    private final String manufacture;

    public Smartphone(String name, int cost, String manufacture) {

        super(name, cost);

        this.manufacture = manufacture;
    }
}
