package entity;

public class Place extends Vehicle{
    public Place(){}

    public Place(int id, int capacity, double maxVelocity) {
        super(id, capacity, maxVelocity);
    }

    @Override
    public String fuelType(){
        return "Querosene de avião";
    }
}
