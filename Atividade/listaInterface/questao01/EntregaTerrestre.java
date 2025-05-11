public class EntregaTerrestre implements Entrega{
    private String enderecoEntrega;
    private double tempoEstimado;

    public EntregaTerrestre(){} 

    public EntregaTerrestre(String enderecoEntrega, double tempoEstimado){
        this.enderecoEntrega = enderecoEntrega;
        this.tempoEstimado = tempoEstimado;
    }

    public String getEnderecoEntrega(){
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) throws Exception{
        if(enderecoEntrega == null || enderecoEntrega.trim().isEmpty()){
            throw new Exception();
        }
        this.enderecoEntrega = enderecoEntrega;
    }

    public double getTempoEstimado(){
        return tempoEstimado;
    }

    public void setTempoEstimado(double tempoEstimado) throws Exception{
        if(tempoEstimado <= 0){
            throw new Exception();
        }
        this.tempoEstimado = tempoEstimado;
    }

    @Override
    public double calcularFrete(double distancia){
        return distancia *  0.75;
    }
    
    @Override
    public void descricaoRota(){
        System.out.println("Endereço da entrega: " + enderecoEntrega);
        System.out.println("Tempo estimado: " + tempoEstimado);
    }
}