package entity;

import exceptions.ValidateDistanceException;

public class Motocicle extends Vehicle {
    public Motocicle(){}

    public Motocicle(int id, String model, int capacity) {
        super(id, model, capacity);
    }

    @Override
    public double timeCalculate(double distance){
        if(distance < 0){
            throw new ValidateDistanceException();
        }
        return distance/100;
    }
}
