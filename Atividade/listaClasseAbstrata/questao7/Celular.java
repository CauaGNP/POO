public class Celular extends ProdutoEletronico{
    public Celular(String modelo, double preco, Fabricante fabricante){
        super(modelo, preco, fabricante);
    }

    @Override
    public double calcularGarantiaEstendida(){
        return getPreco() * 0.10 + 50;
    }

    @Override 
    public void descricaoDetalhada(){
        System.out.println("Modelo do celular: " + getModelo());
        System.out.println("Fabricante: " + getFabricante());
        System.out.println("Garantia: " + calcularGarantiaEstendida());
    }
}