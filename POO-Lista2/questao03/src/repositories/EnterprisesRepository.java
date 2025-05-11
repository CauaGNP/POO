package repositories;
import intity.Employee;

import java.util.ArrayList;

public class EnterprisesRepository implements IEmployee{

    private ArrayList<Employee> listTheEmployees;

    public EnterprisesRepository(){
        this.listTheEmployees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        this.listTheEmployees.add(employee);
    }

    public void calculatePayroll(){
        double calculatedPay = 0;
        for(Employee e : listTheEmployees){
            calculatedPay += e.getBaseSalary();
        }

        System.out.println("Folha de pagamento: " + calculatedPay);
    }

    @Override
    public void getAllEmployee(){
        for(Employee e : listTheEmployees){
            System.out.println("Nome do funcionário: " + e.getName());
            System.out.println("Salario: " + e.getBaseSalary());
            System.out.println("-------");
        }
    }

    @Override
    public Employee getEmployeeForId(int id){
        for(Employee e : listTheEmployees){
            if(e.getId() == id){
                return e;
            }
        }
        return null;
    }

    @Override
    public void deleteEmployee(int id){
        Employee e = getEmployeeForId(id);
        listTheEmployees.remove(e);
    }

    @Override
    public void updateEmployee(int id, String newName){
        Employee e = getEmployeeForId(id);
        e.setName(newName);

    }
}
