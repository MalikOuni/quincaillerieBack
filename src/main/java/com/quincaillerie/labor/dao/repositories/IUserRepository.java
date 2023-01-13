package com.quincaillerie.labor.dao.repositories;


import com.quincaillerie.labor.dao.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
