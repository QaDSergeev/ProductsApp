package ru.netology.product;

public class Product {

    protected int id;
    protected final String name;
    protected final int cost;

    protected Product(String name, int cost) {

        this.name = name;
        this.cost = cost;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public boolean matches(String search) {

        return getName().contains(search);
    }
}
