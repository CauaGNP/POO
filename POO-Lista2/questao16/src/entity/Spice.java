package entity;

public class Spice extends Ingredients{
    public Spice() {}

    public Spice(String name, double quantity) {
        super(name, quantity);
    }

    @Override
    public String informations(){
        return "Nome do tempero: " + getName() + ", quantidade em gramas: " + getQuantity();
    }
}
