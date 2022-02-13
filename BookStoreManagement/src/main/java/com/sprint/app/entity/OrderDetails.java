package com.sprint.app.entity;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Data
@Getter
@Setter
public class OrderDetails {
	
	private Book book;
	private Order order;
	private int quantity;
	private double totalAmount;
}
