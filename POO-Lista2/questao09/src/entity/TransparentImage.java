package entity;

public class TransparentImage extends Image{
    public TransparentImage(){}

    public TransparentImage(int id, int height, int width){
        super(id, height, width);
    }

    @Override
    public String process(){
        return "Aplicando uma mácara de transparência na imagem.";
    }
}
