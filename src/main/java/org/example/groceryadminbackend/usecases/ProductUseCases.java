package org.example.groceryadminbackend.usecases;

import org.example.groceryadminbackend.entities.Product;

import java.util.List;

public interface ProductUseCases {
    public Product createProduct(Product product);
    public Product getProductById(String publicId);
    public Product getProductByName(String name);
    public List<Product> getAllProducts();
    public Product updateProduct(Product product);
    public Product patchProductStock(Product product, int newStock);
    public void deleteProduct(Product product);
}
