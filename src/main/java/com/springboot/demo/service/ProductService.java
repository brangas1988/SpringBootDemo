package com.springboot.demo.service;


import com.springboot.demo.dta.ProductRepo;
import com.springboot.demo.model.Product;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo prodrepo;


    public List<Product> getProducts() {
        return prodrepo.findAll();
    }

    public Product getProductsbyid(int prodid) {
        return prodrepo.findById(prodid).orElse(new Product());
    }

    public Product addproduct( Product prod) {
        return prodrepo.save(prod);
    }
    public void deleteproduct( int prod) {
         prodrepo.deleteById(prod);
    }

    public Product retrieve( int prod) {
        return prodrepo.findById(prod).orElse(new Product());
    }
}
