package entity;

public class Develloper extends TeamMember{
    public Develloper(){}

    public Develloper(int id, String name, String project){
        super(id, name, project);
    }

    @Override
    public String work(){
        return "Escrevendo código para o projeto";
    }
}
