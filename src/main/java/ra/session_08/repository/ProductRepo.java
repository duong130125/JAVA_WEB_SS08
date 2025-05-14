package ra.session_08.repository;

import ra.session_08.model.Product;

import java.util.List;

public interface ProductRepo {
    List<Product> findAll();
    boolean addProduct(Product product);
}
