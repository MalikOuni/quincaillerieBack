package com.quincaillerie.labor.web.rest;

import com.quincaillerie.labor.dao.entities.User;
import com.quincaillerie.labor.dto.UserDTO;
import com.quincaillerie.labor.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/user")
public class UserRestController {

    @Autowired
    private IUserService service;

    @PostMapping("/add")
    public void createUser(@RequestBody UserDTO User){
        service.addUser(User);
    }

    @PutMapping("/update")
    public void updateUser(@RequestBody User User){
        service.updateUser(User);
    }

    @DeleteMapping("/delete/{idUser}")
    public void deleteUser(@PathVariable("idUser") Long id) {
        service.deleteUser(id);
    }
    @GetMapping("/all")
    public List<User> getAll (){
        return service.getAll();
    }
}
