package com.crud.crud.Services;


import com.crud.crud.Repository.Repo;
import com.crud.crud.entity.Product;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServices {

    private final Repo repository;

    public ProductServices(Repo repository) {
        this.repository = repository;
    }

    public Product save(Product product) {
        return repository.save(product);
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Product update(Integer id, Product productDetails) {
        Product product = findById(id);
        if (product != null) {
            product.setName(productDetails.getName());
            product.setPrice(productDetails.getPrice());
            return repository.save(product);
        }
        return null;
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
