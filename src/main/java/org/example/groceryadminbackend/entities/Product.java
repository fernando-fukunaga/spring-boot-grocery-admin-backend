package org.example.groceryadminbackend.entities;

import java.math.BigDecimal;

public class Product {
    private int private_id;
    private String public_id;
    private String name;
    private String description;
    private int stock;
    private BigDecimal unitValue;

    public Product(String public_id, String name, String description, int stock, BigDecimal unitValue) {
        this.public_id = public_id;
        this.name = name;
        this.description = description;
        this.stock = stock;
        this.unitValue = unitValue;
    }

    public int getPrivate_id() {
        return private_id;
    }

    public void setPrivate_id(int private_id) {
        this.private_id = private_id;
    }

    public String getPublic_id() {
        return public_id;
    }

    public void setPublic_id(String public_id) {
        this.public_id = public_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public BigDecimal getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(BigDecimal unitValue) {
        this.unitValue = unitValue;
    }
}
