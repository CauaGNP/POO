package entity;

import exception.EmptyNameValues;

import java.util.ArrayList;

public class Provider {
    private String name;
    private ArrayList<Product> productList;

    public Provider() {
        this.productList = new ArrayList<>();
    }

    public Provider(String name) {
        setName(name);
        this.productList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()) {
            throw new EmptyNameValues();
        }
        this.name = name;
    }

    public void supplierProduct(Product product){
        this.productList.add(product);
    }

    public String listProductProvider(){
        for(Product product : productList){
            System.out.println(product.getName());
        }
        return null;
    }
}
