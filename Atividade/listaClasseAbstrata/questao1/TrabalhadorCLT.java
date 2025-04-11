public class TrabalhadorCLT extends Trabalhador{
    public TrabalhadorCLT(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario(double valor){
        if(getSalarioBase() > 3000){
            setSalarioBase(getSalarioBase() + 500); 
            return getSalarioBase();
        }
        return getSalarioBase();
    };
    
    @Override
    public String descricaoTrabalho(){ 
        return "O trabalhador " + getNome() + " está na modalidade CLT";
    };
}