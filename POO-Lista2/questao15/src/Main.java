import entity.*;

public class Main {
    public static void main(String[] args) {
        CarControl car = new CarControl();
        DroneControl drone = new DroneControl();
        ShipControl ship = new ShipControl();
        AutonomousSystem system = new AutonomousSystem();

        System.out.println(system.navigation(car,"Marco Zero", 50));
        System.out.println(system.navigation(drone,"Jardim", 60));
        System.out.println(system.navigation(ship,"Inglaterra", 100));
    }
}