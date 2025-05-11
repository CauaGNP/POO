package entity;
import exceptions.*;
public abstract class Vehicle {

    private int id;
    private int capacity;
    private double maxVelocity;

    public Vehicle(){}

    public Vehicle(int id, int capacity, double maxVelocity){
        this.id = id;
        this.capacity = capacity;
        this.maxVelocity = maxVelocity;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if(capacity <= 0){
            throw new MaxCapacityException("A capacidade máxima do seu veículo deve ser maior que 0");
        }
        this.capacity = capacity;
    }

    public double getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(double maxVelocity){
        if(maxVelocity <= 0){
            throw new IncorretVelocityException("A velocidade máxima tem que ser maior que 0");
        }
        this.maxVelocity = maxVelocity;
    }

    public double calculateTime(double distance){
        return distance / maxVelocity;
    }
    public abstract String fuelType();
}
