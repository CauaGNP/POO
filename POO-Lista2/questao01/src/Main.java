import entity.Cat;
import entity.Dog;
import repositories.ZooAnimalRepository;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog(1, "Jorginho", 5);
        Cat cat1 = new Cat(2, "Clebao", 5);
        Dog dog2 = new Dog(3, "Joana", 5);
        Cat cat2 = new Cat(4, "Josefina", 5);

        ZooAnimalRepository zoo = new ZooAnimalRepository();

        zoo.addAnimal(dog1);
        zoo.addAnimal(cat1);
        zoo.addAnimal(dog2);
        zoo.addAnimal(cat2);

        zoo.getAllAnimal();

        System.out.println(zoo.getAnimalById(2));

        zoo.updateNameAnimal(3, "Marcia");
        System.out.println(zoo.getAnimalById(3));

        zoo.deleteAnimal(4);

        zoo.getAllAnimal();
    }
}