package Atividade.atv1;

public class Livro {
    public String nome;
    public String editora;
    public int quantidadePag;
    
    public Livro(String nome, String editora, int quantidadePag){
        this.nome = nome;
        this.editora = editora;
        this.quantidadePag = quantidadePag;
    }

    public void continenteFamoso(String nomeContinente){
        System.out.println("O livro: " + nome + " tem maior fama no continente: " + nomeContinente);
    }
}