package com.quincaillerie.labor.dao.repositories;

import com.quincaillerie.labor.dao.entities.Exchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IExchangeRepository extends JpaRepository<Exchange,Long> {
}
