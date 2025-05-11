package entity;

public class ColorFulImage extends Image{
    public ColorFulImage(){}

    public ColorFulImage(int id, int height, int width){
        super(id, height, width);
    }

    @Override
    public String process(){
        return "Aplicando saturação na imagem em, " + calculateSize() + "pixels.";
    }
}
