package entity;

import exceptions.InvalidRateException;

public class Book extends LibraryMaterial {
    public Book(){}

    public Book(int id, String title, int devolution, double rate){
        super(id, title, devolution);
        setRate(rate);
    }

    @Override
    public double calculateFine(int daysLate){
        if(getRate() >= 1){
            throw new InvalidRateException("A taxa deve ser menor que 1");
        }
        return daysLate * getRate();
    }
}
