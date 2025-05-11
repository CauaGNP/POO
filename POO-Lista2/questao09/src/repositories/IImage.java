package repositories;

import entity.Image;

public interface IImage {
    void getAllImages();
    Image getImageForId(int id);
    void deleteImage(int id);
}
