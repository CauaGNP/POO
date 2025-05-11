package repositories;

import entity.Dish;

import java.util.ArrayList;

public class Buffer implements IDish{

    private ArrayList<Dish> bufferList;

    public Buffer(){
        this.bufferList = new ArrayList<>();
    }

    public void addDishInBuffer(Dish dish){
        this.bufferList.add(dish);
    }

    @Override
    public void getAllDishes(){
        for(Dish dish : bufferList){
            System.out.println(dish.getName());
            dish.getAllIngredients();
        }
    }

    @Override
    public Dish getDishForName(String dishName){
        for(Dish dish : bufferList){
            if(dish.getName().equals(dishName)){
                return dish;
            }
        }
        return null;
    }

    @Override
    public void updateNameDish(String dishName, String newDishName){
        Dish getDishName = getDishForName(dishName);
        getDishName.setName(newDishName);
        System.out.println("Nome do prato atualizado: ");
    }

    @Override
    public void deleteDishForName(String dishName){
        Dish getDishName = getDishForName(dishName);
        bufferList.remove(getDishName);
        System.out.println("prato Removido do buffer.");
    }
}
