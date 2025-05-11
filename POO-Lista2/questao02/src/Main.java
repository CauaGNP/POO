import entity.*;
import exceptions.*;
import repositories.VehicleGarageRepository;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Azul", "Fusca", "ABCD123", 4);
        Car car2 = new Car("Branco", "Fiat Uno", "ACDD123", 4);
        Motocicle motocicle1 = new Motocicle("Preta","Yamaha 250", "ASDE654", "Reto");
        Motocicle motocicle2 = new Motocicle("Vermelha","Honda", "ASDE654", "Reto");

        VehicleGarageRepository garageRepo = new VehicleGarageRepository();

        garageRepo.addVehicle(car1);
        garageRepo.addVehicle(car2);
        garageRepo.addVehicle(motocicle1);
        garageRepo.addVehicle(motocicle2);

        garageRepo.getAllVeiculos();
        System.out.println("--------");
        garageRepo.getVehicleForPlate("ABCD123");
        System.out.println("--------");
        garageRepo.deleteVehicleForPlate("ABCD123");
        System.out.println("--------");
        garageRepo.getAllVeiculos();
    }
}