package entity;

public class Ship extends Vehicle {
    public Ship(){}

    public Ship(int id, int capacity, double maxVelocity){
        super(id, capacity, maxVelocity);
    }

    @Override
    public String fuelType(){
        return "Disel marinho";
    }
}
