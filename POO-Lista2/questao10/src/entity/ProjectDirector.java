package entity;

public class ProjectDirector extends TeamMember{
    public ProjectDirector(){}

    public ProjectDirector(int id, String name, String project){
        super(id, name, project);
    }

    @Override
    public String work(){
        return "Coordenando o progresso do projeto";
    }
}
