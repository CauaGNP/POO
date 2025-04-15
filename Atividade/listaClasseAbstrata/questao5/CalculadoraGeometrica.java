public class CalculadoraGeometrica{
    private FiguraGeometrica figura;

    public CalculadoraGeometrica(FiguraGeometrica figura){
        if(figura == null){
            throw new IllegalArgumentException();
        }
        this.figura = figura;
    }

    public FiguraGeometrica getFigura(){
        return figura;
    }

    public void setFigura(FiguraGeometrica figura){
        if(figura == null){
            throw new IllegalArgumentException();
        }
        this.figura = figura;
    }

    public double areaTotal(){
        return figura.calcularArea();
    }

    public double perimetroTotal(){
        return figura.calcularPerimetro();
    }
}