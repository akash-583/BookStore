package com.sprint.app.dto;

import java.util.Date;

import lombok.Data;

@Data
public class CustomerDTO {
	private int customerId;
	private String email;
	private String fullName;
	private String password;
	private long mobileNumber;
}
