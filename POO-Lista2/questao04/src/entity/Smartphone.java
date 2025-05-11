package entity;

public class Smartphone extends Product{

    public Smartphone(){}

    public Smartphone(int id, String name, double price){
        super(id, name, price);
    }

    @Override
    public double guaranteeCalculate(){
        return 2;
    }
}
