package intity;

public class Trainee extends  Employee{

    public Trainee(){}

    public Trainee(String name, int id){
        super(name, id);
    }

    @Override
    public double calculateSalary(double value){
        //this params not  is usable;
        return getBaseSalary();
    }
}
