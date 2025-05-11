import entity.Clothing;
import entity.Eletronic;
import entity.Food;
import entity.Provider;

public class Main {
    public static void main(String[] args) {
        Eletronic eletronic = new Eletronic("Celular", 1280);
        Food food = new Food("Pepsi", 120);
        Clothing clothing = new Clothing("Camiseta", 120);

        System.out.println(eletronic.calculateDiscount());
        System.out.println(food.calculateDiscount());
        System.out.println(clothing.calculateDiscount());

        Provider provider = new Provider("MixTudo");

        provider.supplierProduct(eletronic);
        provider.supplierProduct(food);
        provider.supplierProduct(clothing);

        provider.listProductProvider();
    }
}