package com.quincaillerie.labor.web.rest;


import com.quincaillerie.labor.dao.entities.Sale;
import com.quincaillerie.labor.dto.SaleDTO;
import com.quincaillerie.labor.service.ISaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/sale")
public class SaleRestController {

    @Autowired
    private ISaleService service;

    @PostMapping("/add")
    public void createCommande(@RequestBody SaleDTO commande){
        service.addCommande(commande);
    }

    @PutMapping("/update")
    public void updateCommande(@RequestBody Sale sale){
        service.updateCommande(sale);
    }

    @DeleteMapping("/delete/{idCommande}")
    public void deleteCommande(@PathVariable("idCommande") Long id) {
        service.deleteCommande(id);
    }
    @GetMapping("/all")
    public List<Sale> getAll (){
        return service.getAll();
    }
}
