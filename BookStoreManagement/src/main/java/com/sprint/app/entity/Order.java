package com.sprint.app.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Order {
	
	@Id	
	private int orderId;
	private LocalDate orderDate;
	
	private double orderTotal;
	private String status;
	private Address ShippingAddress;
	private String paymentMethod;
	private String recipientName;
	private String recipientPhone;
	
	
	@Embedded
	private List<OrderDetails> booksList;
}
