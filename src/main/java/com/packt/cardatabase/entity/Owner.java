package com.packt.cardatabase.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.List;

@Document(collection = "owners")
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private ObjectId ownerid;
    private String firstname,lastname;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
    @JsonIgnore
    private List<Car> cars;


    public Owner() {
    }

    public Owner(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
