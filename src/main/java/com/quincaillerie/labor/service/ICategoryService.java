package com.quincaillerie.labor.service;

import com.quincaillerie.labor.dao.entities.Category;
import com.quincaillerie.labor.dto.CategoryDTO;

import java.util.List;

public interface ICategoryService {
    void addCategory(CategoryDTO Category);

    void updateCategory(Category Category);

    void deleteCategory(Long id);

    List<Category> getAll();
}
