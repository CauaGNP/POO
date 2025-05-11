package repositories;

import entity.TeamMember;

public interface ITeamMember {
    void getAllTeamMembers();
    TeamMember getTeamMembersForName(String name);
    void updateNameTeamMembers(String teamMember,String newName);
    void deleteTeamMember(String newName);
}
