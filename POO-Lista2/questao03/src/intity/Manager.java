package intity;

public class Manager extends Employee{

    public Manager(){}

    public Manager(String name, int id){
        super(name, id);
    }

    @Override
    public double calculateSalary(double bonusValue){
        setBaseSalary(getBaseSalary() + bonusValue);
        return getBaseSalary();
    }
}
