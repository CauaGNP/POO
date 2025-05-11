package entity;

public class Design extends Task{
    public Design(){}

    public Design(String description){
        super(description);
    }

    @Override
    public String realizeTask(){
        return "Realizando o design.";
    }
}
