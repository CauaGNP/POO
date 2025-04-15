public class Gato extends Pet{
    public Gato(String nome, int idade){
        super(nome, idade);
    } 

    @Override
    public String emitirSom(){
        return "Minhau";
    }

    public String reagir(String acao){
        if("barulho".equals(acao)){
            return getNome() + " está se escondendo";
        }
        return "";
    }
}