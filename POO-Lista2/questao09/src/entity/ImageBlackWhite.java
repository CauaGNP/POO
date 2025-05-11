package entity;

public class ImageBlackWhite extends Image{
    public ImageBlackWhite(){}

    public ImageBlackWhite(int id, int height, int width){
        super(id, height, width);
    }

    @Override
    public String process(){
        return "Imagem convertida para preto e branco.";
    }
}
