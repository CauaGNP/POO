import entity.Design;
import entity.Develloper;
import entity.ProjectDirector;
import entity.ProjectManager;
import exceptions.ProjectInvalidException;
import repositories.Bussines;

public class Main {
    public static void main(String[] args) {
        Develloper dev = new Develloper(1, "Jonas", "Landing Page");
        ProjectDirector director = new ProjectDirector(2, "Cleber", "McDonald");
        Design design = new Design(3, "Joana", "Landing Page");

        ProjectManager projectManager = new ProjectManager("Landing Page");

        projectManager.addMember(dev);
        try{
            projectManager.addMember(director);
        }catch (ProjectInvalidException e ){
            System.out.println(e.getMessage());
        }
        projectManager.addMember(design);

        projectManager.displayReport(dev);
        projectManager.listMembersForProject();

        Bussines bussines = new Bussines();

        bussines.addMember(dev);
        bussines.addMember(director);
        bussines.addMember(design);

        System.out.println(bussines.getMemberForId(1).getName());

        bussines.updateNameMemberForId(1, "Joservaldo");
        bussines.deleteMemberForId(2);

        bussines.getAllMembers();

    }
}