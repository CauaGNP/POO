public class Piano extends instrumento{
    public Piano(String modelo, double custo) {
        super(modelo, custo);
    }

    @Override
    public String afinar(){
        return "Afinando o piano modelo " + modelo + " ajustando os martelos.";
    }

    @Override
    public String tocar(){
        return "Som grave e harmônico do piano modelo " + modelo + ".";
    }
}