package entity;

import exceptions.EmptyStringException;

import java.util.ArrayList;

public class Dish {
    private String name;
    private ArrayList<Ingredients> ingredientsList;

    public Dish(){
        this.ingredientsList = new ArrayList<>();
    }

    public Dish(String name) {
        setName(name);
        this.ingredientsList = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name == null || name.trim().isEmpty()){
            throw new EmptyStringException();
        }
        this.name = name;
    }

    public void addIngredients(Ingredients ingredients){
        ingredientsList.add(ingredients);
        System.out.println("Ingrediente adicionado no prato: " + name);
    }

    public void getAllIngredients(){
        for(Ingredients i : ingredientsList){
            System.out.println(i.getName());
        }
    }
}