package entity;

import exceptions.EmptyStringException;
import exceptions.QuantityIncorretValueException;

public abstract class Ingredients {

    String name;
    double quantity;

    public Ingredients(){}
    public Ingredients(String name, double quantity){
        setName(name);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new EmptyStringException();
        }
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        if(quantity <= 0){
            throw new QuantityIncorretValueException();
        }
        this.quantity = quantity;
    }

    public abstract String informations();

}
