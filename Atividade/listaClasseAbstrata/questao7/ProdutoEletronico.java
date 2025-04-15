public abstract class ProdutoEletronico{
    private String modelo;
    private double preco;
    private Fabricante fabricante;
    
    public ProdutoEletronico(String modelo, double preco, Fabricante fabricante){
        if(modelo == null || modelo.trim().isEmpty()){
            throw new IllegalArgumentException();
        }
        if(preco < 100){
            throw new IllegalArgumentException();
        }
        if(fabricante == null){
            throw new IllegalArgumentException();
        }
        this.modelo = modelo;
        this.preco = preco;
        this.fabricante = fabricante;
    }

    public String getModelo(){
        return modelo;
    } 

    public void setModelo(String modelo){
        if(modelo == null || modelo.trim().isEmpty()){
            throw new IllegalArgumentException();
        }
        this.modelo = modelo;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        if(preco < 100){
            throw new IllegalArgumentException();
        }
        this.preco = preco;
    }

    public Fabricante getFabricante(){
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante){
        if(fabricante == null){
            throw new IllegalArgumentException();
        }
        this.fabricante = fabricante;
    }

    public abstract double calcularGarantiaEstendida();
    public abstract void descricaoDetalhada();
}