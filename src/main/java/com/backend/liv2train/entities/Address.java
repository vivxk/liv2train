package com.backend.liv2train.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "address")
@Getter
@Setter
@NoArgsConstructor
public class Address {

	@NotNull
	private String fullAddress;
	@NotNull
	private String city;
	@NotNull
	private String state;
	@Min(value = 6)
	@Id
	private int pincode;

}
