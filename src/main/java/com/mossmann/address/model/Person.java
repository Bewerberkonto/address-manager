package com.mossmann.address.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@RequiredArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String vorname;
    private String nachname;
    @ManyToMany
    private List<Address> addressList;
    @ManyToMany
    private List<PhoneNumber> phoneNumberList;
}
