package intity;

import exceptions.NullValuesException;

public class Developer extends Employee{

    public Developer(){}

    public Developer(String name, int id){
        super(name,id);
    }

    @Override
    public double calculateSalary(double productivity){
        if(productivity == 0){
            throw new NullValuesException("Erro ao adicionar o indici de produtividade");
        }
        setBaseSalary(getBaseSalary() * productivity);
        return getBaseSalary();
    }
}
