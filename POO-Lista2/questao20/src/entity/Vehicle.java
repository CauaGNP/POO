package entity;

import exceptions.EmptyStringException;
import exceptions.ValidateCapacityException;
import exceptions.ValidateIdException;

public abstract class Vehicle {
    private int id;
    private String model;
    private int capacity;

    public Vehicle(){}

    public Vehicle(int id, String model, int capacity){
        setId(id);
        setModel(model);
        setCapacity(capacity);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id < 0){
            throw new ValidateIdException();
        }
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model == null || model.trim().isEmpty()){
            throw new EmptyStringException("Campo modelo não pode ser vazio.");
        }
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if(id < 0){
            throw new ValidateCapacityException();
        }
        this.capacity = capacity;
    }

    public abstract double timeCalculate(double distance);
}
