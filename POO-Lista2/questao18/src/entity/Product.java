package entity;

import exception.EmptyNameValues;
import exception.IncorretNumberException;

public abstract class Product {

    private String name;
    private double price;

    public Product() {}

    public Product(String name, double price) {
        setName(name);
        setPrice(price);
    }

    public String getName() {
        if(name == null || name.trim().isEmpty()){
            throw new EmptyNameValues();
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            throw new IncorretNumberException();
        }
        this.price = price;
    }

    public abstract double calculateDiscount();
}
