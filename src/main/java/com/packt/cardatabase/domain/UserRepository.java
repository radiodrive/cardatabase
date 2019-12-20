package com.packt.cardatabase.domain;

import com.packt.cardatabase.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface UserRepository extends MongoRepository<User, Long> {

    User findByUsername(String username);
}
