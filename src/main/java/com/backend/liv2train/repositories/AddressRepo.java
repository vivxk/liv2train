package com.backend.liv2train.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.liv2train.entities.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
