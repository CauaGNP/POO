package entity;

public class Development extends Task{
    public Development(){}

    public Development(String description){
        super(description);
    }

    @Override
    public String realizeTask(){
        return "Tarefa em desenvolvimento";
    }
}
