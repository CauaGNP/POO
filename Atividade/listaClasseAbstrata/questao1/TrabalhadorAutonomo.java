public class TrabalhadorAutonomo extends Trabalhador{
    public TrabalhadorAutonomo(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario(double valor){
        if(getSalarioBase() < 1500){ 
            setSalarioBase(getSalarioBase() + 200); 
            return getSalarioBase();
        }
        setSalarioBase(getSalarioBase() + (getSalarioBase() * 0.8));
        return getSalarioBase(); 
    };
    
    @Override
    public String descricaoTrabalho(){ 
        return "O trabalhador " + getNome() + " está na modalidade Autônomo";
    };
}