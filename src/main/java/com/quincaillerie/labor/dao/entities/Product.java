package com.quincaillerie.labor.dao.entities;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Column(unique = true)
    private String image;
    private String reference;
    private Double price;
    private String description;
    private String quantity;
    private String soldQuantity;
   @ManyToMany
   @JoinColumn(name = "commande_ligne")
   private List<Sale> sold;
   @ManyToOne
   private Exchange exchange;
}
