package org.example;

public class Store extends ProductList {

    public Store() {
        super();
    }

    public void addProduct(Product product, int quantity) {
        if (products.containsKey(product)) {
            int currentQuantity = products.get(product);
            products.put(product, currentQuantity + quantity);
        } else {
            products.put(product, quantity);
        }
    }

    public void removeProduct(Product product, int quantity) {
        if (products.containsKey(product)) {
            int currentQuantity = products.get(product);
            if (currentQuantity > quantity) {
                products.put(product, currentQuantity - quantity);
            } else {
                System.out.println("Превышено количество остатка товара: " + currentQuantity);
            }
        }
    }

    @Override
    public String toString() {
        return "Товары в магазине:\n"+
                super.toString();
    }
}
