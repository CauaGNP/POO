package Atividade.atv1;

public class Computador {
    public String marca;
    public String processador;
    public String bateria;
    public String producao;

    public Computador(String marca, String processador, String bateria){
        this.marca = marca;
        this.processador = processador;
        this.bateria = bateria;
        this.producao = "Brasil";
    }

    public Computador(String marca, String processador, String bateria, String producao){
        this.marca = marca;
        this.processador = processador;
        this.bateria = bateria;
        this.producao = producao;
    }

    public boolean ligado(){
        System.out.println("Seu computador: " + marca + " está ligado: ");
        return true;
    }

    public boolean desligado(){
        System.out.println("Seu computador: " + marca + " está desligado: ");
        return false;
    }
}
