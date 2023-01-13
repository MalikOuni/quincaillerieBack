package com.quincaillerie.labor.dao.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Deposit {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer capacity;
    private Integer usedCapacity;
    @OneToMany
    private List<Product> product;
}
