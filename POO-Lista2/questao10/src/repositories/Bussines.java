package repositories;

import entity.TeamMember;

import java.util.ArrayList;

public class Bussines implements ITeamMember{

    public ArrayList<TeamMember> listMembers;

    public Bussines(){
        this.listMembers = new ArrayList<>();
    }

    public void addMember(TeamMember member){
        listMembers.add(member);
    }

    @Override
    public void getAllMembers(){
        for(TeamMember member : listMembers){
            System.out.println(member.getName());
        }
    }

    @Override
    public TeamMember getMemberForId(int id){
        for(TeamMember member : listMembers){
            if(member.getId() == id){
                return member;
            }
        }
        return null;
    }

    @Override
    public void updateNameMemberForId(int id, String name){
        TeamMember member = getMemberForId(id);
        member.setName(name);
        System.out.println("Nome atualizado");
    }

    @Override
    public void deleteMemberForId(int id){
        TeamMember member = getMemberForId(id);
        listMembers.remove(member);
        System.out.println("Membro deletado");
    }
}
