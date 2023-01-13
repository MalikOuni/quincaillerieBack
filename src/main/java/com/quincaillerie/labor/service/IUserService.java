package com.quincaillerie.labor.service;

import com.quincaillerie.labor.dao.entities.User;
import com.quincaillerie.labor.dto.UserDTO;

import java.util.List;

public interface IUserService {
    void addUser(UserDTO user);

    void updateUser(User user);

    void deleteUser(Long id);

    User findUserByUsername(String username);

    List<User> getAll();
}
