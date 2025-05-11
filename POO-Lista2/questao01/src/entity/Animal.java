package entity;

import exceptions.*;

public abstract class Animal {

    private int id;
    private String name;
    private int age;

    public Animal(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) throws Exception{
        if(id <= 0){
            throw new Exception("O ID nãp pode ser menor ou igual a 0");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        if(name == null || name.trim().equals("")){
            throw new NameExceptions("Nome não pode ser vazio");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Id:" + id + ", Nome='" + name + ", Idade: " + age ;
    }

    public abstract void makeSound();
}
