package entity;
import exceptions.*;

public abstract class LibraryMaterial {
    private int id;
    private String title;
    private int devolution;
    private double rate;

    public LibraryMaterial(){}

    public LibraryMaterial(int id, String title, int devolution){
        this.id = id;
        this.title = title;
        this.devolution = devolution;
        this.rate = 1.5;
    }

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        if(title == null || title.trim().isEmpty()){
            throw new NullValuesException("O título não pode ser vazio");
        }
        this.title = title;
    }

    public int getDevolution() {
        return devolution;
    }

    public void setDevolution(int devolution){
        this.devolution = devolution;
    }

    public double getRate(){
        return rate;
    }

    public void setRate(double rate){
        if(rate <= 0){
            throw new InvalidRateException("A taxa deve ser maior que zero");
        }
        this.rate = rate;
    }

    public double calculateFine(int daysLate){
        return daysLate * rate;
    }

    public String toString(){
        return "Título: " + title + ", Prazo de devolução: " + devolution;
    }
}
