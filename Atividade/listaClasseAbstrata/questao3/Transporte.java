public abstract class Transporte{
    private int velocidadeMaxima;
    private String marca;

    public Transporte(int velocidadeMaxima, String marca){
        if(velocidadeMaxima < 10){
            throw new IllegalArgumentException();
        }
        if(marca == null || marca.trim().isEmpty()){
            throw new IllegalArgumentException();;
        }
        this.velocidadeMaxima = velocidadeMaxima;
        this.marca = marca;
    }

    public int getVelocidadeMaxima(){
        return velocidadeMaxima;
    }

    public void setvelocidadeMaxima(int velocidadeMaxima){
        if(velocidadeMaxima < 10){
            throw new IllegalArgumentException();
        }
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        if(marca == null || marca.trim().isEmpty()){
            throw new IllegalArgumentException();;
        }
        this.marca = marca;
    }

    public abstract double calcularTempoViagem(double distancia); 
    public abstract String tipoCombustivel(); 
}