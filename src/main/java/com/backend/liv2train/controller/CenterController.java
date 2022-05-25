package com.backend.liv2train.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.liv2train.entities.Center;
import com.backend.liv2train.service.CenterService;

@RestController
@RequestMapping("/api")
public class CenterController {

	@Autowired
	private CenterService centerService;

	/*
	 * addCenter(): Adds a new center
	 */
	@PostMapping("/")
	public ResponseEntity<Center> addCenter(@Valid @RequestBody Center center) {
		Center createdCenter = this.centerService.createCenter(center);
		return new ResponseEntity<Center>(createdCenter, HttpStatus.CREATED);
	}

	/*
	 * getCenter(): Get List Of all Centers
	 */
	@GetMapping("/")
	public ResponseEntity<List<Center>> getCenter() {
		return ResponseEntity.ok(this.centerService.getCenter());
	}

	/*
	 * getCenterByCode(): Gets a center by it's center code
	 */
	@GetMapping("/{code}")
	public ResponseEntity<Center> getCenterByCode(@PathVariable String code) {
		return ResponseEntity.ok(this.centerService.getCenterByCode(code));
	}

}
