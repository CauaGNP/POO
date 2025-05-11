package entity;

public class Clothing extends Product{
    public Clothing( String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount(){
        return getPrice() * 0.15;
    }
}
