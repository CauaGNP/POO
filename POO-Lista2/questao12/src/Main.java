import entity.*;

public class Main {
    public static void main(String[] args){
        DiscountStrategy loyalty = new LoyaltyDiscount();
        DiscountStrategy promotional = new PromotionalDiscount();
        DiscountStrategy seasonal = new SeasonalDiscount();

        ManagerDiscount gestorDesconto = new ManagerDiscount();

        System.out.println(gestorDesconto.applyDiscount(loyalty, 200));
        System.out.println(gestorDesconto.applyDiscount(promotional, 200));
        System.out.println(gestorDesconto.applyDiscount(seasonal, 200));
    }
}
