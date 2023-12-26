package com.workshop.workshopmongo.services;

import com.workshop.workshopmongo.domans.Post;
import com.workshop.workshopmongo.domans.User;
import com.workshop.workshopmongo.dtos.UserDTO;
import com.workshop.workshopmongo.repositorys.PostRepository;
import com.workshop.workshopmongo.repositorys.UserRepository;
import com.workshop.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post findById(String id){
        Optional<Post> obj = postRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User fromDTO(UserDTO objDto){
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}
