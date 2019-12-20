package com.packt.cardatabase.domain;

import com.packt.cardatabase.entity.Car;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource
public interface CarRepository extends MongoRepository <Car, String> {


    List<Car> findByBrandAndModel(String brand,String model);

    @Override
    long count();

    @Override
    List<Car> findAll();

    @Override
    Optional<Car> findById(String aString);

    @Override
    void delete(Car car);

    @Override
    void deleteAll();

    @Override
    <S extends Car> List<S> saveAll(Iterable<S> iterable);
}
