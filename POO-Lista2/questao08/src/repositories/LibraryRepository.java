package repositories;

import entity.*;
import java.util.ArrayList;

public class LibraryRepository implements ILibraryMaterial{

    private ArrayList<LibraryMaterial> listMaterial;

    public LibraryRepository(){
        this.listMaterial = new ArrayList<>();
    }

    public void addMaterialInList(LibraryMaterial material){
        this.listMaterial.add(material);
    }

    @Override
    public void getAllMaterial(){
        for(LibraryMaterial material : listMaterial){
            System.out.println("Título: " + material.getTitle());
            System.out.println("Devolução: " + material.getDevolution());
            System.out.println("-----");
        }
    }

    @Override
    public LibraryMaterial getMaterialForId(int id){
        for(LibraryMaterial material : listMaterial){
            if(material.getId() == id){
                return material;
            }
        }
        return null;
    }

    @Override
    public void updateTitleMaterialForId(int id, String newTitle){
        LibraryMaterial material = getMaterialForId(id);
        material.setTitle(newTitle);
        System.out.println("Título atualizado");
    }

    @Override
    public void deleteMaterialForId(int id){
        LibraryMaterial material = getMaterialForId(id);
        listMaterial.remove(material);
        System.out.println("Material removido da Biblioteca");
    }
}
