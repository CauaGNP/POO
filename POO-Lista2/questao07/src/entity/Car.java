package entity;

public class Car extends Vehicle {
    public Car(){}

    public Car(int id, int capacity, double maxVelocity){
        super(id, capacity, maxVelocity);
    }

    @Override
    public String fuelType(){
        return "Gasolina";
    }
}
