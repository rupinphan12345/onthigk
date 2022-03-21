package com.example.recycle_view;

import java.io.Serializable;

public class Product implements Serializable {
    private int imgProduct;
    private String name;
    private double price;

    public Product() {
    }

    public Product(int imgProduct, String name, double price) {
        this.imgProduct = imgProduct;
        this.name = name;
        this.price = price;
    }

    public int getImgProduct() {
        return imgProduct;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setImgProduct(int imgProduct) {
        this.imgProduct = imgProduct;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "imgProduct=" + imgProduct +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
