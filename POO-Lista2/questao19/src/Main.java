import entity.*;
import repositories.TeamMemberRepositorie;

public class Main {
    public static void main(String[] args) {
        Development development = new Development("Login front-end");
        Design design = new Design("Telas apicação");
        Test test = new Test("testando API");

        TeamMember tm1 = new TeamMember("Joana");
        TeamMember tm2 = new TeamMember("Julia" );
        TeamMember tm3 = new TeamMember("Carlos");

        tm1.addTask(test);
        tm1.addTask(development);
        tm3.addTask(design);

        tm3.getTaskList();

        TeamMemberRepositorie tmr = new TeamMemberRepositorie();

        tmr.addTeamMember(tm1);
        tmr.addTeamMember(tm2);
        tmr.addTeamMember(tm3);

        System.out.println(tmr.getTeamMembersForName("Joana"));

        tmr.updateNameTeamMembers("Joana", "Joanes");
        System.out.println(tmr.getTeamMembersForName("Joana"));

        tmr.deleteTeamMember("Joana");
        tmr.getAllTeamMembers();
    }
}