public class EntregaTerrestre implements Entrega{
    private String nomeRota;
    private double ganhoKm;
    private double ganhoRota;

    public EntregaTerrestre(){}

    public EntregaTerrestre(String nomeRota) throws Exception{
        if(nome == null || nome.trim().isEmpty()){
            throw new Exception();
        }
        this.nomeRota = nomeRota;
        this.ganhoKm = 0.75;
    }

    public String getNomeRota(){
        return nomeRota;
    }

    public void setNomeRota(String nomeRota){
        if(nome == null || nome.trim().isEmpty()){
            throw new Exception();
        }
        this.nomeRota = nomeRota;
    }

    public double getGanhoKm(){
        return ganhoKm;
    }

    public void setGanhoKm(){
        this.ganhoKm = 0.75;
    }

    public double getGanhoRota(){
        return ganhoRota;
    }

    @Override
    public double calcularFrete(double distancia) throws Exception{
        if(distancia <= 0){ 
            throw new Exception();
        }
        return ganhoRota = distancia * ganhoKm;
    }

    @Override
    public void descricaoRota(){
        System.out.println("Nome da rota: " + nomeRota);
        System.out.println("Ganho pela rota" + getGanhoRota());
    }
}