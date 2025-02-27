package Aulas.aula1;

public class Aluno {
    public String nome;
    public double altura;

    public void estudar(String materia){
        System.out.println(nome + " está estudando " + materia + "!!");
    }

    public void pedirNota(String prof){
        System.out.println(nome + " está pedindo nota para o professor " + prof + "!! :C");
    }
}
