package org.example;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Телефон", 18000, 5);
        Product product2 = new Product("Ноутбук", 25000, 3);
        Product product3 = new Product("Футболка", 800, 4);
        Product product4 = new Product("Джинсы", 2500, 4);

        Category category1 = new Category("Электроника");
        category1.addProduct(product1);
        category1.addProduct(product2);

        Category category2 = new Category("Одежда");
        category2.addProduct(product3);
        category2.addProduct(product4);

        Store store = new Store();
        store.addProduct(product1, 20);
        store.addProduct(product2, 10);
        store.addProduct(product3, 500);
        store.addProduct(product4, 300);

        System.out.println(store);

        User user1 = new User("user1", "password1");
        user1.addToBasket(product1, 1, store);
        user1.addToBasket(product3, 3, store);

        User user2 = new User("user2", "password2");
        user2.addToBasket(product2, 1, store);
        user2.addToBasket(product3, 1, store);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(store);
    }
}