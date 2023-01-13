package com.quincaillerie.labor.dao.repositories;

import com.quincaillerie.labor.dao.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {
}
