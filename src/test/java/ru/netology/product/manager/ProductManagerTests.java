package ru.netology.product.manager;

import org.junit.jupiter.api.Test;

import ru.netology.product.Book;
import ru.netology.product.Product;
import ru.netology.product.Smartphone;

import ru.netology.product.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductManagerTests {

    Book book1 = new Book("history 1", 3000, "Petya Petrov");
    Book book2 = new Book("history 7", 3000, "Petya Petrov");
    Book book3 = new Book("english language", 4000, "Ivan Ivanov");
    Smartphone smartphone1 = new Smartphone("Iphone 7", 100000, "Chine");
    Smartphone smartphone2 = new Smartphone("Highscreen", 105000, "South Korea");

    @Test
    public void shouldSearchProductByFullName() {

        ProductRepository productRepository = new ProductRepository();
        ProductManager productManager = new ProductManager(productRepository);

        productManager.add(book1);
        productManager.add(book2);
        productManager.add(smartphone1);
        productManager.add(smartphone2);

        Product[] actualProducts = {book1};
        Product[] expectedProducts = productManager.searchBy(book1.getName());

        assertArrayEquals(actualProducts, expectedProducts);
    }

    @Test
    public void shouldSearchProductByStartWith() {

        ProductRepository productRepository = new ProductRepository();
        ProductManager productManager = new ProductManager(productRepository);

        productManager.add(book1);
        productManager.add(book2);
        productManager.add(book3);
        productManager.add(smartphone1);
        productManager.add(smartphone2);

        Product[] expectedProducts = {book1, book2};
        Product[] actualProducts = productManager.searchBy("history");

        assertArrayEquals(expectedProducts, actualProducts);
    }

    @Test
    public void shouldSearchProductByEndsWith() {

        ProductRepository productRepository = new ProductRepository();
        ProductManager productManager = new ProductManager(productRepository);

        productManager.add(book1);
        productManager.add(book2);
        productManager.add(book3);
        productManager.add(smartphone1);
        productManager.add(smartphone2);

        Product[] expectedProducts = {book2, smartphone1};
        Product[] actualProducts = productManager.searchBy("7");

        assertArrayEquals(expectedProducts, actualProducts);
    }
}
