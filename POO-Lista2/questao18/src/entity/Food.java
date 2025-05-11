package entity;

public class Food extends Product {
    public Food( String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount(){
        return getPrice() * 0.05;
    }
}
