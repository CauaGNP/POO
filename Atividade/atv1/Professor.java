package Atividade.atv1;

public class Professor {
    String nome;
    String idade;
    String materiaLecionada;
    String turno;

    public Professor(String nome, String idade, String materiaLecionada){
        this.nome = nome;
        this.idade = idade;
        this.materiaLecionada = materiaLecionada;
        this.turno = "noite";
    }

    public Professor(String nome, String idade, String materiaLecionada, String turno){
        this.nome = nome;
        this.idade = idade;
        this.materiaLecionada = materiaLecionada;
        this.turno = turno;
    }

    public void info(){
        System.out.println("O professor: " + nome + " está lecinando a cadeira: " + materiaLecionada + " no turno: " + turno);
    }
}
