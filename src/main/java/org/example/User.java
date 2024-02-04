package org.example;

public class User {
    private String username;
    private String password;
    private Basket basket;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.basket = new Basket();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void addToBasket(Product product, int quantity, Store store) {
        basket.buyProduct(product, quantity, store);
    }

    @Override
    public String toString() {
        return "Покупки " +
                username +
                ":\n" +
                basket;
    }
}
