package com.workshop.workshopmongo.resources;

import com.workshop.workshopmongo.doman.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        User maria = new User(1L, "Maria ", "maria@gmail.com");
        User welinton = new User(2L, "Welinton ", "welinton@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(maria,welinton));
        return ResponseEntity.ok().body(list);
    }
}