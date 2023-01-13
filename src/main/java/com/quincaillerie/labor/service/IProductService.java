package com.quincaillerie.labor.service;

import com.quincaillerie.labor.dao.entities.Product;
import com.quincaillerie.labor.dto.ProductDTO;

import java.util.List;

public interface IProductService {
    void addProduct(ProductDTO product);

    void updateProduct(Product product);

    void deleteProduct(Long id);

    List<Product> getAll();
}
