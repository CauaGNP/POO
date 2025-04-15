public class Violao extends Instrumento{
    public Violao(String modelo, double custo) {
        super(modelo, custo);
    }

    @Override
    public String afinar(){
        return "Afinando o violão modelo " + getModelo() + " com tensão nas cordas.";
    }

    @Override
    public String tocar(){
        return "Som suave e acústico do violão modelo " + getModelo() + ".";
    }
}