import java.util.Scanner;

public class att5 {
    public static class Dog{

        public String name;
        public String surname;
        public int age;
        public String color;

        public Dog(String name, String surname, int age, String color){
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.color = color;
        }

        public Dog() {
                    
                }
        
                void completName(){
                    System.out.println("O nome completo do seu cachorro é:" + name + " " + surname);
                }
        
                void speed(){
                    System.out.println(name + " é rápido");
                }
            }
        
            public class Type extends Dog {
                public String type;
                public Type (String name, String surname, int age, String color){
                    super(name, surname, age, color);
                    this.type = type;
                }
            }
            public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);
        
                System.out.print("Digite o primeiro nome do seu cachorro: ");
                String nameDog1 = scanner.nextLine();
                
                System.out.print("Digite o sobrenome do seu cachorro: ");
                String surnameDog1 = scanner.nextLine();
        
                System.out.print("Digite a cor do seu cachorro: ");
                String colorDog1 = scanner.nextLine();
                
                System.out.print("Digite a idade do seu cachorro: ");
                int ageDog1 = scanner.nextInt();
        
                Dog dog1 = new Dog();

        dog1.name = nameDog1;
        dog1.surname = surnameDog1;
        dog1.age = ageDog1;
        dog1.color = colorDog1;

        System.out.println(dog1);
        dog1.completName();
        dog1.speed();
    }
}
