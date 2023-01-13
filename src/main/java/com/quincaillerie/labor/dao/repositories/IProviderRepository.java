package com.quincaillerie.labor.dao.repositories;

import com.quincaillerie.labor.dao.entities.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProviderRepository extends JpaRepository<Provider,Long> {
}
