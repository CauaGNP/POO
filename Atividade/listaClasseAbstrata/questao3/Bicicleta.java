public class Bicicleta extends Transporte{
    public Bicicleta(int velocidadeMaxima, String marca){
        super(velocidadeMaxima, marca);
    }

    @Override
    public double calcularSalario(double distancia){
        return distancia / (velocidadeMedia * 0.5);
    }

    @Override
    public String tipoCombustivel(){
        return "Nenhum";
    }
}