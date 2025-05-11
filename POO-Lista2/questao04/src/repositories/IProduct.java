package repositories;

import entity.Product;

public interface IProduct{
    void getAllProducts();
    Product getProductForId(int id);
    void updateNameProduct(int id, String newName);
    void deleteNameForId(int id);
}
