package entity;

import exceptions.NullValueException;

public class Car extends Vehicle {
    private int numberDoors;

    public Car(){
    }

    public Car(String color, String model, String plate ,int numberDoors){
        super(color, model, plate);
        if(numberDoors <= 0){
            throw new NullValueException("Número de portas não pode ser igual ou menor que zero");
        }
        this.numberDoors = numberDoors;
    }

    public int getNumberDoors(){
        return numberDoors;
    }

    public void setnumberDoors(int numberDoors){
        if(numberDoors <= 0){
            throw new NullValueException("Número de portas não pode ser igual ou menor que zero");
        }
        this.numberDoors = numberDoors;
    }

    @Override
    public void informacoes(){
        System.out.println("Modelo do carro: " + getModel());
        System.out.println("Cor do carro: " + getColor());
        System.out.println("Quantidade de portas do carro: " + numberDoors);
        System.out.println("Placa do carro: " + getPlate());
    }
}
