package entity;

public class Magazine extends Material{
    public Magazine(){}

    public Magazine(String title){
        super(title);
    }

    @Override
    public String materialInfo(){
        return "Título da revista: " + getTitle();
    }
}
