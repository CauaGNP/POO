package entity;

import exceptions.*;

import java.util.ArrayList;

public class ProjectManager {

    private ArrayList<TeamMember> project;
    private String nameProject;

    public ProjectManager(String nameProject){
        this.project = new ArrayList<>();
        this.nameProject = nameProject;
    }

    public String getNameProject() {
        return nameProject;
    }

    public void setNameProject(String nameProject) {
        if(nameProject == null || nameProject.trim().isEmpty()){
            throw new NullValuesExceptions("O nome do projeto não pode ser nulo");
        }
        this.nameProject = nameProject;
    }

    public void addMember(TeamMember member){
        if(member.getProject().trim() != nameProject.trim()){
            throw new ProjectInvalidException("Membros de projetos diferentes");
        }
        project.add(member);
    }

    public String displayReport(TeamMember member){
        return "Nome: " + member.getName() + ", projeto: " + member.getProject() + ", tarefa" + member.work();
    }

    public void listMembersForProject(){
        for(TeamMember teamMember : project){
            System.out.println(teamMember.getName());
        }
    }
}
