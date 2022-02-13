package com.sprint.app.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer{
	
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
	
	@OneToMany(targetEntity = Order.class, cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="customer_fk",referencedColumnName = "customerId")
	private List<Order> customerOrders;
}
