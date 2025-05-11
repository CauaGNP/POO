package entity;
import exceptions.*;

public abstract class TeamMember {

    private int id;
    private String name;
    private String project;

    public TeamMember(){}

    public TeamMember(int id, String name, String project){
        this.id = id;
        this.name = name;
        this.project = project;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new NullValuesExceptions("O nome não deve ser vazio");
        }
        this.name = name;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        if(project == null || project.trim().isEmpty()){
            throw new NullValuesExceptions("O nome do projeto não deve ser vazio");
        }
        this.project = project;
    }

    public abstract String work();

    public String getDetails(){
        return name + ", está vinculado ao projeto: " + project;
    }
}
