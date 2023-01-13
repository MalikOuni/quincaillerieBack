package com.quincaillerie.labor.dao.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Sale implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String saleDate;
    private Double Amount;
    private Double payedAmount;
    private Integer Discount;
    @ManyToOne
    @JoinColumn (name = "client_id")
    private Client client;
    @ManyToMany
    @JoinColumn(name = "commande_ligne")
    private List<Product> productLine;

}
