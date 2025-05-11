import intity.Developer;
import intity.Manager;
import intity.Trainee;
import repositories.EnterprisesRepository;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Clóvis", 1);
        Developer developer = new Developer("Gilberto", 2);
        Trainee trainee = new Trainee("Robervaldo", 3);

        manager.calculateSalary(300);
        developer.calculateSalary(2);
        trainee.calculateSalary(0);

        EnterprisesRepository enterprisesRepository = new EnterprisesRepository();

        enterprisesRepository.addEmployee(manager);
        enterprisesRepository.addEmployee(developer);
        enterprisesRepository.addEmployee(trainee);

        enterprisesRepository.getAllEmployee();


        System.out.println(enterprisesRepository.getEmployeeForId(2).getName());
        enterprisesRepository.updateEmployee(2, "Robertão");
        System.out.println(enterprisesRepository.getEmployeeForId(2).getName());

        enterprisesRepository.deleteEmployee(2);
        enterprisesRepository.getAllEmployee();

        enterprisesRepository.calculatePayroll();
    }
}