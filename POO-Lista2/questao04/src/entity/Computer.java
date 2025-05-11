package entity;

public class Computer extends Product{
    public Computer(){}

    public Computer(int id, String name, double price){
        super(id, name, price);
    }

    @Override
    public double guaranteeCalculate(){
        return 3;
    }
}
