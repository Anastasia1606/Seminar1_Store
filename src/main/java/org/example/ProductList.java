package org.example;

import java.util.Map;
import java.util.HashMap;

public class ProductList {

    Map<Product, Integer> products;

    public ProductList() {
        products = new HashMap<>();
    }

    @Override
    public String toString() {
        String res = "";
        for(Map.Entry<Product, Integer> entry: products.entrySet()) {
            res = res + entry.getKey().getName() + " - " + entry.getValue() + "\n";
        }
        return res;
    }
}
