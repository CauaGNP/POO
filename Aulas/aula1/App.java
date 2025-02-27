package Aulas.aula1;

public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.nome = "Cleber";
        aluno1.altura = 1.70;
        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Altura: " + aluno1.altura);
        aluno1.estudar("POO");
        aluno1.pedirNota("Iago");

        aluno2.nome = "Pedrinho";
        aluno2.altura = 1.40;
        System.out.println("Nome: " + aluno2.nome);
        System.out.println("Altura: " + aluno2.altura);
        aluno2.estudar("Front-End");
        aluno2.pedirNota("Marcio");
    }
}
