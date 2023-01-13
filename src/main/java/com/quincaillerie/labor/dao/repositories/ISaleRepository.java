package com.quincaillerie.labor.dao.repositories;

import com.quincaillerie.labor.dao.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISaleRepository extends JpaRepository<Sale, Long> {
}
