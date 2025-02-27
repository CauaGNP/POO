package Atividade.atv1;

public class Universidade {
    public String nome;
    public String abreviacao;
    public int quantAluno;

    public Universidade(String nome, String abreviacao, int quantAluno){
        this.nome = nome;
        this.abreviacao = abreviacao;
        this.quantAluno = quantAluno;
    }

    public void info(){
        System.out.println("A universidade" + nome + "(" + abreviacao + "), tem o total de " + quantAluno + " alunos");
    }
}
