package entity;

public class Motocicle extends Vehicle{

    private String handlebarType;

    public Motocicle(){}

    public Motocicle(String color, String model, String plate, String handlebarType){
        super(color, model, plate);
        if(handlebarType == null || handlebarType.length() == 0){
            throw new NullPointerException("Guidão não pode ser nulo");
        }
        this.handlebarType = handlebarType;
    }

    public String getHandlebarType(){
        return handlebarType;
    }

    public void setHandlebarTypr(String handlebarType){
        if(handlebarType == null || handlebarType.length() == 0){
            throw new NullPointerException("Guidão não pode ser nulo");
        }
        this.handlebarType = handlebarType;
    }

    @Override
    public void informacoes(){
        System.out.println("Modelo da moto: " + getModel());
        System.out.println("Cor da moto: " + getColor());
        System.out.println("Tipo de guidão da moto: " + handlebarType);
        System.out.println("Placa da moto: " + getPlate());

    }
}
