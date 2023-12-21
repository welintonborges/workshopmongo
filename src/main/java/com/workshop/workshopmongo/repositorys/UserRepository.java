package com.workshop.workshopmongo.repositorys;

import com.workshop.workshopmongo.doman.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends MongoRepository<User, String> {
}
