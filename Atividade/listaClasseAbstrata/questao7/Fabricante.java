public class Fabricante{
    private String nome;

    public Fabricante(String nome){
        if(nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException();
        }
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        if(nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException();
        }
        this.nome = nome;
    }
}