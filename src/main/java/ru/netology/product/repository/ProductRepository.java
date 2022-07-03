package ru.netology.product.repository;

import ru.netology.product.Product;

public class ProductRepository {
    private Product[] products;

    public ProductRepository() {

        products = new Product[0];
    }

    public void add(Product product) {

        Product[] tmp = new Product[products.length + 1];

        for (int ind = 0; ind < products.length; ind++) {

            tmp[ind] = products[ind];
        }

        product.setId(tmp.length);
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    public void removeProduct(int id) {

        Product[] tmp = new Product[products.length - 1];
        int index = -1;

        for (Product product : products) {

            if (product.getId() != id) {

                tmp[++index] = product;
            }
        }

        products = tmp;
    }

    public Product[] getAllProducts() {

        return products;
    }
}
