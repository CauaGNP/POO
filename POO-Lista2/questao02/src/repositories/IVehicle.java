package repositories;

import entity.Vehicle;

public interface IVehicle {
    void getAllVeiculos();
    Vehicle getVehicleForPlate(String plate);
    void deleteVehicleForPlate(String plate);
}
