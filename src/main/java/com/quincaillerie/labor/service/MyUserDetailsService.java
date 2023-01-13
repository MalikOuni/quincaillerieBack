package com.quincaillerie.labor.service;

import com.quincaillerie.labor.dao.entities.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserServiceImpl userService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User userFromDb = userService.findUserByUsername(userName);
        if(userFromDb != null){
            return new org.springframework.security.core.userdetails.User
                    ( userFromDb.getUsername(),userFromDb.getPassword(),userFromDb.getAuthorities());
        }
        return null;

    }
}
