package org.example;

import java.util.HashMap;
import java.util.Map;

public class Basket extends ProductList {
    public Basket() {
        super();
    }

    public void buyProduct(Product product, int quantity, Store store) {
        if(store.products.containsKey(product)){
            int availableQuantity = store.products.get(product);
            if(availableQuantity >= quantity){
                if (products.containsKey(product)) {
                    products.put(product, products.get(product) + quantity);
                } else {
                    products.put(product, quantity);
                }
                store.products.put(product, availableQuantity - quantity);
            } else {
                System.out.println("Превышено количество товара в магазине: " + availableQuantity);
            }
        }
        else{
            System.out.println("Товар " + product.getName() + " не найден.");
        }
    }
}

