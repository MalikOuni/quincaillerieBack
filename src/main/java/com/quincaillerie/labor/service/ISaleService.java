package com.quincaillerie.labor.service;

import com.quincaillerie.labor.dao.entities.Sale;
import com.quincaillerie.labor.dto.SaleDTO;

import java.util.List;

public interface ISaleService {
    void addCommande(SaleDTO order);

    void updateCommande(Sale order);

    void deleteCommande(Long id);

    List<Sale> getAll();
    
}
