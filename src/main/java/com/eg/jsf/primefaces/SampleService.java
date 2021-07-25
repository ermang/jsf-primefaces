package com.eg.jsf.primefaces;

import java.util.ArrayList;
import java.util.List;

public class SampleService {
    //private List<Product> products;

    public List<Product> search() {
        List<Product> products = new ArrayList<Product>();
        Product p = new Product();
        p.setName("p1");
        p.setQuantity(1);
        Product p2 = new Product();
        p2.setName("p2");
        p2.setQuantity(2);
        products.add(p);
        products.add(p2);

        return products;
    }

//    public SampleService() {
//        this.products = new ArrayList<Product>();
//    }

//    public void addProduct() {
//        System.out.println("SampleService.addProduct called");
//        Product p = new Product();
//        p.setName("p1");
//        p.setQuantity(1);
//        Product p2 = new Product();
//        p2.setName("p2");
//        p2.setQuantity(2);
//        products.add(p);
//        products.add(p2);
//    }

//    public List<Product> getProducts() {
//        return products;
//    }
}
