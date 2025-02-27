package Atividade.atv1;

public class Usuario {
    public String nome;
    public String sobrenome;
    public int idade;
    public double altura;

    public Usuario(String nome, String sobrenome, int idade, double altura){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
    }

    public void nomeCompleto(){
        System.out.println("Nome completo do usuário " + nome + ":" + nome + " " + sobrenome);
    }

    public void andar(){
        System.out.println(nome + " está andando");
    }
}
