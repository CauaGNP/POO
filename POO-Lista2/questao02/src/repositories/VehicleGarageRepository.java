package repositories;
import entity.Vehicle;

import java.util.ArrayList;

public class VehicleGarageRepository implements IVehicle{
    private ArrayList<Vehicle> listVehicles;

    public VehicleGarageRepository(){
        this.listVehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        listVehicles.add(vehicle);
        System.out.println("Veiculo estacionado na garagem!");
    }

    @Override
    public void getAllVeiculos(){
        for(int i = 0; i < listVehicles.size(); i++){
            System.out.println("Veiculo " + (i + 1) + ":");
            listVehicles.get(i).informacoes();
        }
    }

    @Override
    public Vehicle getVehicleForPlate(String plate){
        for(int i = 0; i < listVehicles.size(); i++){
            if(listVehicles.get(i).getPlate().equals(plate)){
                return listVehicles.get(i);
            }
        }
        return null;
    }

    @Override
    public void deleteVehicleForPlate(String plate){
        Vehicle vehicle = getVehicleForPlate(plate);
        listVehicles.remove(vehicle);
        System.out.println("Veiculo removido com sucesso!");
    }
}
