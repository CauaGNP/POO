public abstract class FiguraGeometrica{
    private String cor;
    private double espessura;

    public FiguraGeometrica(String cor, double espessura){
        if(cor == null || cor.trim().isEmpty()){
            throw new IllegalArgumentException(); 
        }
        if(espessura <= 0){
            throw new IllegalArgumentException();
        }
        this.cor = cor;
        this.espessura = espessura;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        if(cor == null || cor.trim().isEmpty()){
            throw new IllegalArgumentException(); 
        }
        this.cor = cor;
    }

    public double getEspessura(){
        return espessura;
    }

    public void setEspessura(double espessura){
        if(espessura <= 0 && espessura > 10){
            throw new IllegalArgumentException();
        }
        this.espessura = espessura;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}