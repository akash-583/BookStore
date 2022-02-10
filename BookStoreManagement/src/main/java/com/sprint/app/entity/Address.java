package com.sprint.app.entity;

import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Address {
	
	private String doorNumber;
	private String area;
	private String locality;
	private String city;
	private String country;
	private String pincode;
}
