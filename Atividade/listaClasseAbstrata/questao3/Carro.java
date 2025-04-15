public class Carro extends Transporte{
    public Carro(int velocidadeMaxima, String marca){
        super(velocidadeMaxima, marca);
    }

    @Override
    public double calcularSalario(double distancia){
        double velocidadeMedia = getVelocidadeMaxima() * 0.8;
        return distancia / velocidadeMedia;
    }

    @Override
    public String tipoCombustivel(){
        return "Gasolina";
    }
}