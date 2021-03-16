package com.mossmann.address.repository;

import com.mossmann.address.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
