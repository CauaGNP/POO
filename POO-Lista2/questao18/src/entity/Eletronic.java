package entity;

public class Eletronic extends Product{

    public Eletronic(){}

    public Eletronic( String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount(){
        return getPrice() * 0.1;
    }
}
