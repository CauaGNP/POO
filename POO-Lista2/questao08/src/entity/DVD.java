package entity;

import exceptions.InvalidRateException;

public class DVD extends LibraryMaterial{
    public DVD(){}

    public DVD(int id, String title, int devolution){
        super(id, title, devolution);
        setRate(5);
    }
}
