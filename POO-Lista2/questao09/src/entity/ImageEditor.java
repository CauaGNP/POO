package entity;

public class ImageEditor {

    public ImageEditor(){}

    public void displayInfo(Image image){
        System.out.println("Altura da imagem" + image.getHeight());
        System.out.println("Largura de imagem" + image.getWidth());
        System.out.println("Descrição" + image.process());
    }

    public void adjustImage(Image image, int newHeight,int newWidth){
        image.setHeight(newHeight);
        image.setWidth(newWidth);
        System.out.println("Imagem atualizada");
    }
}
