package com.example.custom_gridview;

public class Product {
    private int img;
    private String name;
    private double price;

    public Product() {
    }

    public Product(int img, String name, double price) {
        this.img = img;
        this.name = name;
        this.price = price;
    }

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setImg(int img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Product{" +
                "img=" + img +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
