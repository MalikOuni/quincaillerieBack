package com.quincaillerie.labor.dao.repositories;

import com.quincaillerie.labor.dao.entities.Deposit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepositRepository extends JpaRepository<Deposit,Long> {
}
