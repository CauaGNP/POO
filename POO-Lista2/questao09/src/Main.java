import entity.*;
import repositories.GalleryRepository;


public class Main {
    public static void main(String[] args) {
        ColorFulImage fullImage = new ColorFulImage(1, 200, 300);
        ImageBlackWhite blackWhite = new ImageBlackWhite(2, 100, 100);
        TransparentImage transparent = new TransparentImage(1, 300, 150);

        fullImage.calculateSize();
        fullImage.process();

        ImageEditor editor = new ImageEditor();

        editor.displayInfo(blackWhite);
        editor.adjustImage(transparent, 100, 200);

        GalleryRepository gallery = new GalleryRepository();

        gallery.addImages(fullImage);
        gallery.addImages(blackWhite);
        gallery.addImages(transparent);

        System.out.println(gallery.getImageForId(2).process());

        gallery.deleteImage(2);

        gallery.getAllImages();
    }
}