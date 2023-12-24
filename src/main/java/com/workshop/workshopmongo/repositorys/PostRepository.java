package com.workshop.workshopmongo.repositorys;

import com.workshop.workshopmongo.domans.Post;
import com.workshop.workshopmongo.domans.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
