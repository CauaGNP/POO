package entity;

public class ManagerDiscount {
    public ManagerDiscount(){}

    public double applyDiscount(DiscountStrategy strategy, double price){
        double discountStrategy = strategy.discountCalculate(price);
        return discountStrategy;
    }
}
