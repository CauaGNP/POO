package repositories;
import entity.Vehicle;

import java.util.ArrayList;

public class GarageRepository implements IVehicle{

    private ArrayList<Vehicle> listVehicle;

    public GarageRepository(){
        this.listVehicle = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        listVehicle.add(vehicle);
        System.out.println("Veiculo adicionado!!");
    }

    @Override
    public void getAllVehicle(){
    for(Vehicle v : listVehicle){
        System.out.println("ID: " + v.getId());
        System.out.println("Capacidade máxima: " + v.getCapacity());
        System.out.println("---------");
        }
    }

    @Override
    public Vehicle getVehicleForId(int id){
        for(Vehicle v : listVehicle){
            return v;
        }
        return null;
    }

    @Override
    public void updateVehicleForId(int id, int capacity){
        Vehicle vehicle = getVehicleForId(id);
        vehicle.setCapacity(capacity);
        System.out.println("Veiculo atualizado");
    }

    @Override
    public void deleteVehicleForId(int id){
        Vehicle vehicle = getVehicleForId(id);
        listVehicle.remove(vehicle);
        System.out.println("Veículo removido");
    }
}
