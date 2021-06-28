package com.eg.jsf.primefaces;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class Sample {
    private SampleService sampleService = new SampleService();

    private String val1= "val1";
    private String val2= "val2";
    private List<Product>  products = new ArrayList();

    public Sample() {
        System.out.println("Sample constructor");
//        this.products = new ArrayList<Product>();
//        Product p = new Product();
//        p.setName("p17");
//        p.setQuantity(17);
//        products.add(p);
    }

    public void addProduct() {
        System.out.println("Sample.addProduct called");
        Product p = new Product();
        p.setName("p1");
        p.setQuantity(1);
        Product p2 = new Product();
        p2.setName("p2");
        p2.setQuantity(2);
        products.add(p);
        products.add(p2);
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getVal1() {
        return val1;
    }

    public String getVal2() {
        return val2;
    }
}
