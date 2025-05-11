import entity.*;
import repositories.Buffer;

public class Main {
    public static void main(String[] args) {
        Carbohydrates rice = new Carbohydrates("Arroz", 100);
        Protein steak = new Protein("Carne", 50);
        Spice spice = new Spice("Chimichuri", 10);

        rice.informations();
        steak.informations();
        spice.informations();

        SimpleDish simpleDish = new SimpleDish("PF");
        simpleDish.addIngredients(rice);
        simpleDish.addIngredients(steak);
        simpleDish.addIngredients(spice);
        simpleDish.getAllIngredients();
        simpleDish.prepare();

        Buffer buffer = new Buffer();
        buffer.addDishInBuffer(simpleDish);
        buffer.getAllDishes();
        System.out.println(buffer.getDishForName("PF").getName());
        buffer.updateNameDish("PF", "Prato Feito");
        buffer.getAllDishes();
        buffer.deleteDishForName("PF");
    }
}