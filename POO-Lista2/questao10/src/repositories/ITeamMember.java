package repositories;

import entity.TeamMember;

public interface ITeamMember {
    void getAllMembers();
    TeamMember getMemberForId(int id);
    void updateNameMemberForId(int id, String name);
    void deleteMemberForId(int id);
}
