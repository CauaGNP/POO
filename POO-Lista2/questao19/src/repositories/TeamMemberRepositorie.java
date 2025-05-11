package repositories;

import entity.TeamMember;

import java.util.ArrayList;

public class TeamMemberRepositorie implements ITeamMember{
    private ArrayList<TeamMember> teamMembersList;

    public TeamMemberRepositorie(){
        this.teamMembersList = new ArrayList<>();
    }

    public void addTeamMember(TeamMember teamMember){
        this.teamMembersList.add(teamMember);
        System.out.println("Membro adicionado");
    }

    @Override
    public void getAllTeamMembers(){
        for(TeamMember teamMember : teamMembersList){
            System.out.println("Nome do membro da equipe: " + teamMember.getName());
        }
    }

    @Override
    public TeamMember getTeamMembersForName(String name){
        for(TeamMember teamMemberA : teamMembersList){
            if(teamMemberA.getName().equals(name)){
                return teamMemberA;
            }
        }
        return null;
    }

    @Override
    public void updateNameTeamMembers(String teamMemberName, String newName){
        TeamMember specifcTeamMember = getTeamMembersForName(teamMemberName);

        if(specifcTeamMember != null){
            specifcTeamMember.setName(newName);
            System.out.println("Nome do membro:" + specifcTeamMember.getName() + "atualizado");
        }
    }

    @Override
    public void deleteTeamMember(String teamMemberName){
        TeamMember specifcTeamMember = getTeamMembersForName(teamMemberName);
        if(specifcTeamMember != null){
            teamMembersList.remove(specifcTeamMember);
            System.out.println("Membro excluido");
        }
    }
}
