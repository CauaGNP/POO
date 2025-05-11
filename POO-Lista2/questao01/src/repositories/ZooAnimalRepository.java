package repositories;

import exceptions.NameExceptions;
import entity.Animal;

import java.util.ArrayList;

public class ZooAnimalRepository implements IAnimal{
    private ArrayList<Animal> listAnimals;

    public ZooAnimalRepository() {
        this.listAnimals = new ArrayList<>();
    }

    @Override
    public void addAnimal(Animal animal){
        listAnimals.add(animal);
    }

    @Override
    public void getAllAnimal(){
        for(int i = 0; i  < listAnimals.size(); i++){
            System.out.println(listAnimals.get(i).getId() + " " + listAnimals.get(i).getName() + " " + listAnimals.get(i).getAge());
        }
    }

    @Override
    public Animal getAnimalById(int id){
        for(Animal animal : listAnimals){
            if(id == animal.getId()){
                return animal;
            }
        }
        return null;
    }

    @Override
    public void updateNameAnimal(int id, String newName){
        Animal animal = getAnimalById(id);
        if(animal == null){
            throw new RuntimeException("Animal inexistente");
        }
        try {
            animal.setName(newName);
            System.out.println("Troca de nome feita");
        }catch (NameExceptions e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void deleteAnimal(int id){
        Animal animal = getAnimalById(id);
        if(animal == null){
            throw new RuntimeException("Animal inexistente");
        }
        listAnimals.remove(animal);
    }
}
