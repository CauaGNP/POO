public class Cachorro extends Pet{
    public Cachorro(String nome, int idade){
        super(nome, idade);
    } 

    @Override
    public String emitirSom(){
        return "Au au";
    }

    public String reagir(String acao){
        if("carinho".equals(acao)){
            return getNome() + " está abandando o rabo";
        }
        return "";
    }
}