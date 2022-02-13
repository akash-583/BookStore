package com.sprint.app.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	@NotNull(message = "Name cannot be empty")
	private String userName;
	
	@Embedded
	private Address address;
	
	private long mobile;
	
	@NotNull(message = "Email Should be given")
	private String email;
	
	private String password;

	/**
	 * @param userId
	 * @param userName
	 * @param address
	 * @param mobile
	 * @param email
	 */
	public User(int userId, @NotNull(message = "Name cannot be empty") String userName, Address address, long mobile,
			@NotNull(message = "Email Should be given") String email) {
		this.userId = userId;
		this.userName = userName;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
	}

	
	
	
	
	
}
