public class EntregaAerea implements Entrega{
    private String enderecoEntrega;
    private double tempoEstimado;

    public EntregaAerea(){} 

    public EntregaAerea(String enderecoEntrega, double tempoEstimado){
        this.enderecoEntrega = enderecoEntrega;
        this.tempoEstimado = tempoEstimado / 2;
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
        this.tempoEstimado = tempoEstimado / 2;
    }

    @Override
    public double calcularFrete(double distancia){
        return distancia * 2.50;
    }
    
    @Override
    public void descricaoRota(){
        System.out.println("Endereço da entrega: " + enderecoEntrega);
        System.out.println("Tempo estimado: " + tempoEstimado);
    }
}