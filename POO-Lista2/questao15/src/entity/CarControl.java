package entity;

import exceptions.EmptyDestinationValueException;
import exceptions.SpeedValueException;

public class CarControl implements AutonomousControl{

    public CarControl(){}

    @Override
    public String startRoute(String destination){
        if(destination == null || destination.trim().isEmpty()){
            throw new EmptyDestinationValueException();
        }
        return "Rota iniciada para o destino: " + destination;
    }

    public String adjustSpeed(double speed){
        if(speed <= 0){
            throw new SpeedValueException();
        }
        return " Velocidade ajustada: " + speed;
    }
}
