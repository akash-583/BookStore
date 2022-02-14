package com.sprint.app.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class OrderBook {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	
	
	@Embedded
	private Address shippingAddress;
	
	private int quantity;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Book> booksList;
	
}
