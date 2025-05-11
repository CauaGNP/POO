public class Bicicleta extends Transporte{
    public Bicicleta(int velocidadeMaxima, String marca){
        super(velocidadeMaxima, marca);
    }

    @Override
    public double calcularTempoViagem(double distancia){ 
        return distancia / (velocidadeMaxima * 0.5); 
    } 

    @Override
    public String tipoCombustivel(){
        return "Nenhum";
    }
}