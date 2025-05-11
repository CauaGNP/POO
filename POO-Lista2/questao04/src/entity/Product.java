package entity;

import exceptions.*;

public class Product {

    private int id;
    private String name;
    private double price;
    private double guarantee;

    public Product(){}

    public Product(int id, String name, double price ){
        this.id = id;
        this.name = name;
        this.price = price;
        this.guarantee = guaranteeCalculate();
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        if(id <= 0){
            throw new NumberException("O id não pode ser igual a 0");
        }
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        if(name == null|| name.trim().isEmpty()){
            throw new NullValueException("O Nome não pode estar vazio");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            throw new NumberException("O número deve ser maior que zero");
        }
        this.price = price;
    }

    public double getGuarantee() {
        return guarantee;
    }

    public void setGuarantee() {
        this.guarantee = guaranteeCalculate();
    }

    public double guaranteeCalculate(){
        return 1;
    }
}
