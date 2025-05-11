import entity.*;

public class Main {
    public static void main(String[] args) {
    Bus bus = new Bus(1, "Mercedes", 32);
    Car car = new Car(2, "Fiat", 5);
    Motocicle motocicle = new Motocicle(3, "Yamaha", 2);

    System.out.println(bus.timeCalculate(100));
    System.out.println(car.timeCalculate(20));
    System.out.println(motocicle.timeCalculate(40));

    Route route = new Route("Recife", "São Paulo");

    route.addVehicle(bus);
    route.addVehicle(car);
    route.addVehicle(motocicle);

    route.listVehicles();
    }
}