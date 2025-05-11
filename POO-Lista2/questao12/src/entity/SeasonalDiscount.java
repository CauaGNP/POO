package entity;

public class SeasonalDiscount implements DiscountStrategy {
    public SeasonalDiscount(){}

    @Override
    public double discountCalculate(double price){
        return price - (price * 0.10);
    }
}
