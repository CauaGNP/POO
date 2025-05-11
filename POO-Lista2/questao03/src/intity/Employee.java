package intity;
import exceptions.*;

public abstract class Employee {

    private int id;
    private String name;
    private double baseSalary;

    public Employee(){
        this.baseSalary = 1400;
    }

    public Employee(String name, int id){
        if(name == null || name.length() == 0){
            throw new NullValuesException("O nome não pode ser vazio");
        }
        if(id <= 0){
                throw new NullValuesException("O id deve ser maior que 0");
        }
        this.name = name;
        this.baseSalary = 1400;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id <= 0){
            throw new NullValuesException("O id não pode ser maior ou igual a 0");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new NullValuesException("O nome não pode ser vazio");
        }
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary(double value);
}
