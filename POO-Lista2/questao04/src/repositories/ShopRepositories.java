package repositories;

import entity.Product;
import exceptions.NullValueException;
import exceptions.NumberException;

import java.util.ArrayList;

public class ShopRepositories implements IProduct{
    private ArrayList<Product> listProducts;

    public ShopRepositories(){
        this.listProducts = new ArrayList<Product>();
    }

    public void addProduct(Product product){
        listProducts.add(product);
    }

    public void guaranteeList(){
        for(Product p : listProducts){
            System.out.println("Garantia:  " + p.getGuarantee());
        }
    }

    @Override
    public void getAllProducts(){
        for(Product p : listProducts){
            System.out.print("Nome do produto: " + p.getName());
            System.out.print(" ,preço: " + p.getPrice());
            System.out.println(" ,garantia: " + p.getGuarantee());
        }
    }

    @Override
    public Product getProductForId(int id){
        if(id <= 0){
            throw new NumberException("O ID deve ser maior que 0");
        }
        for(Product p : listProducts){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    @Override
    public void updateNameProduct(int id, String newName){
        if(id <= 0){
            throw new NumberException("O ID deve ser maior que 0");
        }
        if(newName == null || newName.trim().isEmpty()){
            throw new NullValueException("O nome não pode ser vazio");
        }
        Product p = getProductForId(id);
        p.setName(newName);
    }

    @Override
    public void deleteNameForId(int id){
         Product p = getProductForId(id);
         listProducts.remove(p);
         System.out.println("Produto deletado com sucesso!");
    }
}
