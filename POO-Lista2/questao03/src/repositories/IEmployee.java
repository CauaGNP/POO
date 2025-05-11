package repositories;

import intity.Employee;

public interface IEmployee {
    public void getAllEmployee();
    public Employee getEmployeeForId(int id);
    public void deleteEmployee(int id);
    public void updateEmployee(int id, String newName);
}
