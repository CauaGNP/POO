package entity;

import exceptions.InvalidRateException;

public class Magazine extends LibraryMaterial{
    public Magazine(){}

    public Magazine(int id, String title, int devolution, double rate){
        super(id, title, devolution);
        setRate(rate);
    }

    @Override
    public double calculateFine(int daysLate){
        if(getRate() <= 2){
            throw new InvalidRateException("A taxa deve ser maior que 2");
        }
        return daysLate * getRate();
    }
}
