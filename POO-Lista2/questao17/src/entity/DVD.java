package entity;

public class DVD extends Material{
    public DVD(){}

    public DVD(String title){
        super(title);
    }

    @Override
    public String materialInfo(){
        return "Título do DVD: " + getTitle();
    }
}
