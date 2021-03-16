package com.mossmann.address.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@Table
public class Address {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    Long Id;
    String street;
    String city;
    String zipCode;
    String country;
    @OneToMany
    List<PhoneNumber> phoneNumberList;
}
