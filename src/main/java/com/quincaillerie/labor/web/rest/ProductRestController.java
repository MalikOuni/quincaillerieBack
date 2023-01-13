package com.quincaillerie.labor.web.rest;

import com.quincaillerie.labor.dao.entities.Product;
import com.quincaillerie.labor.dto.ProductDTO;
import com.quincaillerie.labor.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/product")
public class ProductRestController {

    @Autowired
    private IProductService service;

    @PostMapping("/add")
    public void createProduct(@RequestBody ProductDTO Product){
        service.addProduct(Product);
    }

    @PutMapping("/update")
    public void updateProduct(@RequestBody Product Product){
        service.updateProduct(Product);
    }

    @DeleteMapping("/delete/{idProduct}")
    public void deleteProduct(@PathVariable("idProduct") Long id) {
        service.deleteProduct(id);
    }
    @GetMapping("/all")
    public List<Product> getAll (){
        return service.getAll();
    }
}
