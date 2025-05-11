package entity;

public class Protein extends Ingredients {
    public Protein() {}

    public Protein(String name, double quantity) {
        super(name, quantity);
    }

    @Override
    public String informations(){
        return "Nome da proteina: " + getName() + ", quantidade de proteínas: " + getQuantity();
    }
}
