package com.mossmann.address.repository;

import com.mossmann.address.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {

}
