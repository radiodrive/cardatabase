package com.packt.cardatabase.domain;


import com.packt.cardatabase.entity.Owner;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface OwnerRepository extends MongoRepository<Owner, Long> {


}
