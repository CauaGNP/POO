package entity;

public class Test extends Task{
    public Test(){}

    public Test(String description){
        super(description);
    }

    @Override
    public String realizeTask(){
        return "Realizando testes da aplicação.";
    }
}
