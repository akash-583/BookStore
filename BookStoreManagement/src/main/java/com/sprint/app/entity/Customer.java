package com.sprint.app.entity;

import java.util.Date;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	private String email;
	private String fullName;
	private String password;
	private long mobileNumber;
	private Date registerOn;
	
	@Embedded
	private Address address;
		
}
