package com.quincaillerie.labor.dao.entities;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Data
@Entity
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue
    private long id;
    private String role;

    @Override
    public String getAuthority() {
        return this.role;
    }
}
