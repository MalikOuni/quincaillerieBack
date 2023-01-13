package com.quincaillerie.labor.dao.repositories;

import com.quincaillerie.labor.dao.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClientRepository extends JpaRepository<Client,Long> {
}
