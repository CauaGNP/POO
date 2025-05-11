package repositories;
import entity.Animal;

public interface IAnimal {
    void addAnimal(Animal animal);
    void getAllAnimal();
    Animal getAnimalById(int id);
    void updateNameAnimal(int id, String newName);
    void deleteAnimal(int id);
}
