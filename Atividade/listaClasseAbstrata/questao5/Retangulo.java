public class Retangulo extends FiguraGeometrica{
    private double altura;
    private double largura;

    public Retangulo(String cor, double espessura, double altura, double largura){
        super(cor, espessura);
        if(altura <= 0 || largura <= 0){
            throw new IllegalArgumentException();
        }
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura(){
        return altura;
    } 

    public void setAltura(double altura){
        if(altura <= 0){
            throw new IllegalArgumentException();
        }
        this.altura = altura;
    }

    public double getLargura(){
        return largura;
    }

    public void setLargura(double largura){ 
        if(largura <= 0){
            throw new IllegalArgumentException();
        }
        this.largura = largura;
    }
    
    @Override
    public double calcularArea(){
        return altura * largura;
    }

    public double calcularPerimetro(){
        return (altura * 2) + (largura * 2); 
    }
}