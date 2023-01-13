package com.quincaillerie.labor.dao.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Category {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String name;
    private String image;
    @OneToMany
    private List<Product> products;

}
