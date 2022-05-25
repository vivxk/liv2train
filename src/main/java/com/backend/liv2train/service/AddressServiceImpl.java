package com.backend.liv2train.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.liv2train.entities.Address;
import com.backend.liv2train.repositories.AddressRepo;
@Service
public class AddressServiceImpl implements AdressService {

	@Autowired
	private AddressRepo addressRepo;

	@Override
	public Address addAddress(Address address) {
		Address savedAddress = addressRepo.save(address);
		return savedAddress;
	}

}
