package entity;

public class PromotionalDiscount implements DiscountStrategy {
    public PromotionalDiscount(){}

    @Override
    public double discountCalculate(double price){
        return price - 20;
    }
}
