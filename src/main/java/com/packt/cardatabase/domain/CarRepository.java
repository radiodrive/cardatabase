package com.packt.cardatabase.domain;

import com.packt.cardatabase.entity.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource
public interface CarRepository extends CrudRepository <Car, Long> {


    List<Car> findByBrandAndModel(String brand,String model);

    @Override
    long count();

    @Override
    Iterable<Car> findAll();

    @Override
    Optional<Car> findById(Long aLong);

    @Override
    void delete(Car car);

    @Override
    void deleteAll();

    @Override
    <S extends Car> Iterable<S> saveAll(Iterable<S> iterable);
}
