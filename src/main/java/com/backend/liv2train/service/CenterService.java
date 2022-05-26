package com.backend.liv2train.service;

import java.util.List;

import com.backend.liv2train.entities.Center;

public interface CenterService {

	Center createCenter(Center center);

	List<Center> getCenter();

	Center getCenterByCode(String centercode);

//	Center getCenterByName(String centerName);

}
