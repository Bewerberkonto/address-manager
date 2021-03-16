package com.mossmann.address.model;


import lombok.Data;

import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@Table
public class PhoneType {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    Long id;
    String name;
}
