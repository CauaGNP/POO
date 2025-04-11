public abstract class Trabalhador{
    private String nome;
    private double salarioBase; 

    public Trabalhador(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getSalarioBase(){
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase){
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario(double valor);
    public abstract String descricaoTrabalho();
}