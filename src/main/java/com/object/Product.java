/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.object;

import java.io.Serializable;

/**
 *
 * @author Shado
 */
public class Product implements Serializable{
    
    private int id;
    private int colorId;
    private String name;
    private int price;
    private String size;
    private String description;
    private int status;
    private int category;
    private String image;

    public Product() {
    }

    public Product(int id, int colorId, String name, int price, String size, String description, int status, int category, String image) {
        this.id = id;
        this.colorId = colorId;
        this.name = name;
        this.price = price;
        this.size = size;
        this.description = description;
        this.status = status;
        this.category = category;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", colorId=" + colorId + ", name=" + name + ", price=" + price + ", size=" + size + ", description=" + description + ", status=" + status + ", category=" + category + ", image=" + image + '}';
    }
    
    
}
