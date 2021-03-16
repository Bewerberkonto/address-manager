package com.mossmann.address.model;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@Table
public class PhoneNumber {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String number;
    @ManyToOne
    PhoneType phoneType;
}
