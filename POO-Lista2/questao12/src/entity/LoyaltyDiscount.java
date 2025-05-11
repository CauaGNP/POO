package entity;

public class LoyaltyDiscount implements DiscountStrategy {
    public LoyaltyDiscount(){}

    @Override
    public double discountCalculate(double price){
        return price - (price * 0.05);
    }
}
