package entity;

public class Carbohydrates extends Ingredients{
    public Carbohydrates() {}

    public Carbohydrates(String name, double quantity) {
        super(name, quantity);
    }

    @Override
    public String informations(){
        return "Nome do carboidrato: " + getName() + ", quantidade de carboidratos: " + getQuantity();
    }
}
