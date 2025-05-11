public abstract class Artista{ 
    private String nome;
    private int idade;

    public Artista(){

    }

    public Artista(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public abstract void realizarApresentacao();
}