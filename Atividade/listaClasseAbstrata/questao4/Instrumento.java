public abstract class Instrumento{
    private String modelo;
    private double custo;

    public instrumento(String modelo, double custo){
        if(modelo == null || modelo.trim().isEmpty){
            throw new IllegalArgumentException();
        }
        if(custo < 0){
            throw new IllegalArgumentException();
        }
        this.modelo = modelo;
        this.custo = custo;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        if(modelo == null || modelo.trim().isEmpty){
            throw new IllegalArgumentException();
        }
        this.modelo = modelo;
    }

    public double getCusto(){
        return custo;
    }

    public void setCusto(double custo){
        if(custo < 0){
            throw new IllegalArgumentException();
        }
        this.custo = custo;
    }

    public abstract String afinar();
    public abstract String tocar();
}