public class Motor {
    private String modelo;
    private double cilindrada;

    public Motor(String modelo, double cilindrada){
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    @Override 
    public String toString(){
        return "Motor do modelo " + modelo + " e cilindrada " +  cilindrada; 
    }
}
