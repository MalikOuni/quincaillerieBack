package com.quincaillerie.labor.web.rest;

import com.quincaillerie.labor.dao.entities.Category;
import com.quincaillerie.labor.dto.CategoryDTO;
import com.quincaillerie.labor.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/category")
public class CategoryRestController {
    @Autowired
    private ICategoryService service;

    @PostMapping("/add")
    public void createCategory(@RequestBody CategoryDTO Category){
        service.addCategory(Category);
    }

    @PutMapping("/update")
    public void updateCategory(@RequestBody Category Category){
        service.updateCategory(Category);
    }

    @DeleteMapping("/delete/{idCategory}")
    public void deleteCategory(@PathVariable("idCategory") Long id) {
        service.deleteCategory(id);
    }
    @GetMapping("/all")
    public List<Category> getAll (){
        return service.getAll();
    }
}
