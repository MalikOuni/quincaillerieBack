package com.quincaillerie.labor.dao.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Exchange {
    @Id
    @GeneratedValue
    private Long id;
    private String date;
    private Double amount;
    private Double payedAmount;
    @ManyToOne
    private Provider provider;
    @OneToMany
    private List<Product> products;

}
