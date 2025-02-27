package Aulas.aula2;

public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Cleber", 1.70);
        Aluno aluno2 = new Aluno("Pedrinho", 1.40);
        Aluno aluno3 = new Aluno("FigueiroaJr", 1.22, "angolando");

        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Altura: " + aluno1.altura);
        aluno1.pedirNota("Iago");
 
        System.out.println("Nome: " + aluno2.nome);
        System.out.println("Altura: " + aluno2.altura);
        aluno2.estudar("POO");

        System.out.println(aluno1.nacionalidade);
        System.out.println(aluno3.nacionalidade);
    }
}
