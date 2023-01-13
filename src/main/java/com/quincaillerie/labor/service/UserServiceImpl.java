package com.quincaillerie.labor.service;


import com.quincaillerie.labor.dao.entities.User;
import com.quincaillerie.labor.dao.repositories.IUserRepository;
import com.quincaillerie.labor.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.quincaillerie.labor.dto.UserDTO.fromDtoToEntity;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository repository;

    @Override
    public void addUser(UserDTO User) {
        repository.save(fromDtoToEntity(User));
    }

    @Override
    public void updateUser(User User) {
        if(User != null && User.getId() != null){
            Optional<User> UserFromDb = repository.findById(User.getId());
            if(UserFromDb.isPresent()){
                repository.save(User);
            }
        }
    }

    @Override
    public void deleteUser(Long id) {
        if (id != null){
            repository.deleteById(id);
        }

    }

    @Override
    public User findUserByUsername(String username) {
        return repository.findByUsername(username);
    }


    @Override
    public List<User> getAll() {
        return repository.findAll();
    }
}
