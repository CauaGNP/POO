package entity;

import exceptions.CaracterValuePlateException;
import exceptions.NullValueException;

public abstract class Vehicle {
    private String color;
    private String model;
    private String plate;

    public Vehicle(){}

    public Vehicle(String color, String model, String plate) {
        if(color == null || color.length() == 0  || model == null || model.length() == 0 || plate == null) {
            throw new NullValueException("O valor não pode ser nulo");
        }
        if(plate.length() != 7){
            throw new CaracterValuePlateException("A plava deve ter 7 digitos");
        }
        this.color = color;
        this.model = model;
        this.plate = plate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color == null || color.length() == 0){
            throw new NullValueException("Não é possível alterar a cor para nulo");
        }
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        if(plate == null || plate.length() == 0){
            throw new NullValueException("Número da plana não pode ser 0");
        }
        if(plate.length() != 7){
            throw new CaracterValuePlateException("Os caracteres da placa tem que ser igual a 7, tente novamente");
        }
        this.plate = plate;
    }

    public abstract void informacoes();

}
