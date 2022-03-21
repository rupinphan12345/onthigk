package com.example.project_custom_listview;

public class Product {
    private String name;
    private String description;
    private int picture;

    public Product(String name, String description, int picture) {
        this.name = name;
        this.description = description;
        this.picture = picture;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", picture=" + picture +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public int getPicture() {
        return picture;
    }
}
