package repositories;

import entity.*;

public interface ILibraryMaterial {
    void getAllMaterial();
    LibraryMaterial getMaterialForId(int id);
    void updateTitleMaterialForId(int id, String newTitle);
    void deleteMaterialForId(int id);
}
