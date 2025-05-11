package repositories;

import entity.Vehicle;

public interface IVehicle {
    void getAllVehicle();
    Vehicle getVehicleForId(int id);
    void updateVehicleForId(int id, int capacity);
    void deleteVehicleForId(int id);
}
