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
    private List<Product>  products;
    private String myInput;
    private Param param;

    public Sample() {
        System.out.println("Sample constructor");
        this.products = new ArrayList<Product>();
        this.param = new Param();
    }

    public void search() {
        System.out.println("Sample search called");
        System.out.println("this.param=" + this.param);
        System.out.println("hebele");
        System.out.println("this.param.getParam2() is null");
        System.out.print(this.param.getParam2() == null);
        this.products = sampleService.search();
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

    public String getMyInput() {
        return myInput;
    }

    public void setMyInput(String myInput) {
        this.myInput = myInput;
    }

    public Param getParam() {
        return param;
    }

    public void setParam(Param param) {
        this.param = param;
    }
}
