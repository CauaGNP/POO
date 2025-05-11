package entity;

import exceptions.ValueTitleEmptyException;

import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList<Material> materialLoan;

    public User() {
        this.materialLoan = new ArrayList<>();
    }
    public User(String name) {
        setName(name);
        this.materialLoan = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new ValueTitleEmptyException();
        }
        this.name = name;
    }

    public void addMaterial(Material material) {
        materialLoan.add(material);
        System.out.println("Material adicionado com sucesso!");
    }

    public String materialLoanList(){
        for (Material material : materialLoan) {
            return material.getTitle();
        }
        return null;
    }
}
