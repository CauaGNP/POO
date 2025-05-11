package repositories;

import entity.*;
import java.util.ArrayList;

public class GalleryRepository implements IImage{
    private ArrayList<Image> listImages;

    public GalleryRepository(){
        this.listImages = new ArrayList<>();
    }

    public void addImages(Image image){
        listImages.add(image);
    }

    @Override
    public void getAllImages(){
        for(Image image : listImages){
            System.out.println("Altura da imagem: " + image.getHeight());
            System.out.println("Largura de imagem: " + image.getWidth());
            System.out.println("Tamanho da imagem: " + image.calculateSize());
            System.out.println("------");
        }
    }

    @Override
    public Image getImageForId(int id){
        for(Image image : listImages){
            if(image.getId() == id){
                return image;
            }
        }
        return null;
    }

    @Override
    public void deleteImage(int id){
        Image image = getImageForId(id);
        listImages.remove(image);
        System.out.println("Imagem removida da galeria");
    }
}
