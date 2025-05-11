import entity.*;
import repositories.GarageRepository;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(1, 4, 120);
        Place place1 = new Place(2, 120, 150);
        Ship ship1 = new Ship(3, 500, 200);

        TransportManager transportManager = new TransportManager();

        transportManager.TripCalculate(car1, 20);
        transportManager.TripCalculate(place1, 20);
        transportManager.TripCalculate(ship1, 20);

        GarageRepository garageRepository = new GarageRepository();

        garageRepository.addVehicle(car1);
        garageRepository.addVehicle(place1);
        garageRepository.addVehicle(ship1);

        garageRepository.getAllVehicle();
        System.out.println(garageRepository.getVehicleForId(1).getCapacity());
        garageRepository.updateVehicleForId(2, 160);
        garageRepository.deleteVehicleForId(1);
        garageRepository.getAllVehicle();
    }
}