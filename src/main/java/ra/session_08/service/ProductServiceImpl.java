package ra.session_08.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.session_08.model.Product;
import ra.session_08.repository.ProductRepo;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public boolean addProduct(Product product) {
        return productRepo.addProduct(product);
    }
}
