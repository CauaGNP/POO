package entity;

public class TransportManager {
    public TransportManager(){}

    public void TripCalculate(Vehicle vehicle, double distance){
        Vehicle v = vehicle;
        System.out.println(v.calculateTime(distance));
    }
}
