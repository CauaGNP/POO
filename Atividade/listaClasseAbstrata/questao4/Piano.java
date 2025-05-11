public class Piano extends Instrumento{
    public Piano(String modelo, double custo) {
        super(modelo, custo);
    }

    @Override
    public String afinar(){
        return "Afinando o piano modelo " + getModelo() + " ajustando os martelos.";
    }

    @Override
    public String tocar(){
        return "Som grave e harmônico do piano getModelo() " + getModelo() + ".";
    }
}