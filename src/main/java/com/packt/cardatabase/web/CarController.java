package com.packt.cardatabase.web;

import com.packt.cardatabase.domain.CarRepository;
import com.packt.cardatabase.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @Autowired
    private CarRepository repository;

    @RequestMapping("/cars")
    public Iterable<Car> getCars(){
        return repository.findAll();
    }
}
