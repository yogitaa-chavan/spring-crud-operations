package com.crud.crud.Controller;

import com.crud.crud.Services.ProductServices;
import com.crud.crud.entity.Product;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductServices service;

    public ProductController(ProductServices service) {
        this.service = service;
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return service.save(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Integer id, @RequestBody Product product) {
        return service.update(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Integer id) {
        service.delete(id);
    }
}

