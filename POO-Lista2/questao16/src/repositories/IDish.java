package repositories;

import entity.Dish;

public interface IDish {
    void getAllDishes();
    Dish getDishForName(String dishName);
    void updateNameDish(String dishName, String newDishName);
    void deleteDishForName(String dishName);
}
