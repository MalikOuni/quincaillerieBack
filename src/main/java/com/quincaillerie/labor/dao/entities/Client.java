package com.quincaillerie.labor.dao.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private Integer phone;
    private String address;
    private String email;
    @OneToMany
    private List<Sale> orders;
}
