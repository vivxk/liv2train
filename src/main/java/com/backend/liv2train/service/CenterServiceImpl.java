package com.backend.liv2train.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.liv2train.entities.Center;
import com.backend.liv2train.exceptions.ResourceNotFoundException;
import com.backend.liv2train.repositories.CenterRepo;

@Service
public class CenterServiceImpl implements CenterService {

	@Autowired
	private CenterRepo centerRepo;

	@Override
	public Center createCenter(Center center) {
		center.setCreatedOn(new Date().getTime());
		center.getCreatedOn();
		Center savedCenter = this.centerRepo.save(center);

		return savedCenter;
	}

	@Override
	public List<Center> getCenter() {

		List<Center> findAll = this.centerRepo.findAll();
		return findAll;
	}

	@Override
	public Center getCenterByCode(String code) {
		Center centerByCode = centerRepo.findById(code)
				.orElseThrow(() -> new ResourceNotFoundException("Center", "code", code));
		return centerByCode;
	}

}
