package entity;

import exceptions.ValidateDistanceException;

public class Bus extends Vehicle{
    public Bus(){}

    public Bus(int id, String model, int capacity) {
        super(id, model, capacity);
    }

    @Override
    public double timeCalculate(double distance){
        //A Velocidade média de um ônibus é 75km/h
        if(distance < 0){
            throw new ValidateDistanceException();
        }
        return distance/75;
    }
}
