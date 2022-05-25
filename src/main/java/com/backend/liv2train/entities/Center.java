package com.backend.liv2train.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "center")
@Getter
@Setter
@NoArgsConstructor
public class Center {

	@Id
	@GenericGenerator(name = "centercode", strategy = "com.backend.liv2train.config.IdGenerator")
	@GeneratedValue(generator = "centercode")
	private String centerCode;
	@NotEmpty(message = "Center name cannot be empty!")
	@Size(max = 40)
	private String centerName;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	private int studentCapacity;
	@OneToMany(cascade = CascadeType.ALL)
	List<Courses> courses;
	private long createdOn;
	@Email(message = "Invalid Email!")
	@NotEmpty(message = "Email cannot be empty!")
	private String contactEmail;
	@Pattern(regexp = "^[6-9][0-9]{9}", message = "Invalid Phone No!")
	@NotEmpty
	@Size(min = 10, max = 10, message = "Invalid Phone No!")
	@Column(name = "contact_phone", unique = true, nullable = false)
	private String contactPhone;

}
