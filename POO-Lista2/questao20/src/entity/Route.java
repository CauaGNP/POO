package entity;

import java.util.ArrayList;

public class Route {
    private String origin;
    private String destination;
    private ArrayList<Vehicle> listVehicles;

    public Route(){}

    public Route(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
        this.listVehicles = new ArrayList<>();
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void addVehicle(Vehicle vehicle) {
        listVehicles.add(vehicle);
    }

    public void listVehicles(){
        for(Vehicle vehicle : listVehicles){
            System.out.println("ID: " + vehicle.getId());
            System.out.println("Modelo do veículo: " + vehicle.getModel());
            System.out.println("Capacidade: " + vehicle.getCapacity());
        }
    }
}
