package com.quincaillerie.labor.dao.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Provider {

    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String name;
    private Integer phone;
    private String address;
    private String email;
    @OneToMany
    private List<Exchange> exchanges;
}
