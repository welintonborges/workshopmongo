package com.workshop.workshopmongo.repositorys;

import com.workshop.workshopmongo.domans.Post;
import com.workshop.workshopmongo.domans.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {


    List<Post> findByTitleContainsIgnoreCase(String text);
}
