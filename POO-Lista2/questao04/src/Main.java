import entity.Computer;
import entity.Smartphone;
import entity.Tablet;
import repositories.ShopRepositories;

public class Main {
    public static void main(String[] args) {
        Computer c = new Computer(1, "Lenovo", 2500);
        Smartphone s = new Smartphone(2,"Motorola", 2000);
        Tablet t = new Tablet(3, "Positivo", 750);

        ShopRepositories sr = new ShopRepositories();

        sr.addProduct(c);
        sr.addProduct(s);
        sr.addProduct(t);

        sr.guaranteeList();

        sr.getAllProducts();
        System.out.println(sr.getProductForId(2).getName());
        sr.deleteNameForId(2);
        sr.getAllProducts();
    }
}