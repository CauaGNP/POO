package entity;

public class SimpleDish extends Dish implements Preparation{
    public SimpleDish(){}

    public SimpleDish(String name){
        super(name);
    }

    @Override
    public String prepare(){
        return "Para servir o prato: " + getName() + ", você deve misturar os ingredientes todos juntos e servir.";
    }
}
