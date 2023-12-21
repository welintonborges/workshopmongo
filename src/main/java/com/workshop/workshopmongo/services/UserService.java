package com.workshop.workshopmongo.services;

import com.workshop.workshopmongo.domans.User;
import com.workshop.workshopmongo.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
       return userRepository.findAll();
    }
}
