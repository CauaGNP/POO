package entity;

public class Design extends TeamMember{
    public Design(){}

    public Design(int id, String name, String project){
        super(id, name, project);
    }

    @Override
    public String work(){
        return "Criando design para o projeto";
    }
}
