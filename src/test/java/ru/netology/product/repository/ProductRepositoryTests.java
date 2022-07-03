package ru.netology.product.repository;

import org.junit.jupiter.api.Test;

import ru.netology.product.Book;
import ru.netology.product.Product;
import ru.netology.product.Smartphone;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductRepositoryTests {

    Book book1 = new Book("history", 3000, "Petya Petrov");
    Book book2 = new Book("english language", 4000, "Ivan Ivanov");
    Smartphone smartphone1 = new Smartphone("Iphone 7", 100000, "Chine");
    Smartphone smartphone2 = new Smartphone("Highscreen", 105000, "South Korea");

    @Test
    public void shouldGetAllProducts() {

        ProductRepository repository = new ProductRepository();

        repository.add(book1);
        repository.add(book2);
        repository.add(smartphone1);
        repository.add(smartphone2);

        Product[] actualProducts = {book1, book2, smartphone1, smartphone2};
        Product[] expectedProducts = repository.getAllProducts();

        assertArrayEquals(actualProducts, expectedProducts);
    }

    @Test
    public void shouldRemoveLastProductById() {

        ProductRepository repository = new ProductRepository();

        repository.add(book1);
        repository.add(book2);
        repository.add(smartphone1);
        repository.add(smartphone2);

        repository.removeProduct(smartphone2.getId());

        Product[] actualProducts = {book1, book2, smartphone1};
        Product[] expectedProducts = repository.getAllProducts();

        assertArrayEquals(actualProducts, expectedProducts);
    }

    @Test
    public void shouldRemoveFirstProductById() {

        ProductRepository repository = new ProductRepository();

        repository.add(book1);
        repository.add(book2);
        repository.add(smartphone1);
        repository.add(smartphone2);

        repository.removeProduct(book1.getId());

        Product[] actualProducts = {book2, smartphone1, smartphone2};
        Product[] expectedProducts = repository.getAllProducts();

        assertArrayEquals(actualProducts, expectedProducts);
    }

    @Test
    public void shouldRemoveMiddleProductById() {

        ProductRepository repository = new ProductRepository();

        repository.add(book1);
        repository.add(book2);
        repository.add(smartphone1);
        repository.add(smartphone2);

        repository.removeProduct(smartphone1.getId());

        Product[] actualProducts = {book1, book2, smartphone2};
        Product[] expectedProducts = repository.getAllProducts();

        assertArrayEquals(actualProducts, expectedProducts);
    }
}
