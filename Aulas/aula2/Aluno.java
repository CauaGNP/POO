package Aulas.aula2;

public class Aluno {

    public String nome;
    public double altura;
    public String nacionalidade;

    // Aula2 - Construtores
    
    public Aluno(String nome, double altura){
        this.nome = nome;
        this.altura = altura;
        this.nacionalidade = "brasileiros";
    }

    public Aluno(String nome, double altura, String nacionalidade){
        this.nome = nome;
        this.altura = altura;
        this.nacionalidade = nacionalidade;
    }

    // 

    public void estudar(String materia){
        System.out.println(nome + " está estudando " + materia + "!!");
    }

    public void pedirNota(String prof){
        System.out.println(nome + " está pedindo nota para o professor " + prof + "!! :C");
    }
}
