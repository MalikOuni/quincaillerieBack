package com.quincaillerie.labor.dao.repositories;

import com.quincaillerie.labor.dao.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category,Long> {
}
