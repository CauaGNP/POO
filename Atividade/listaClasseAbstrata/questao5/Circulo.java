public class Circulo extends FiguraGeometrica{
    private double raio;

    public Circulo(String cor, double espessura, double raio){
        super(cor, espessura);
        if(raio <= 0){
            throw new IllegalArgumentException();
        }
        this.raio = raio;
    }

    public double getRaio(){
        return raio;
    }

    public void setRaio(double raio){
        if(raio <= 0){
            throw new IllegalArgumentException();
        }
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        return 3.14 * Math.pow(raio, 2); 
    } 

    public double calcularPerimetro(){
        return 2 * 3.14 * raio;
    }
}