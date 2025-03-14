package Aulas.aula34;

public class Pessoa {
    private String nome;
    private short idade;

    public Pessoa(){

    }

    public Pessoa(String nome, short idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public short getIdade(){
        return idade;
    }

    public void setIdade(short idade){
        if(idade > 17){
            this.idade = idade;
        }  
    }

}
