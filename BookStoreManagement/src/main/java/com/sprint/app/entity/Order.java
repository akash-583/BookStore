package com.sprint.app.entity;

import java.time.LocalDate;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator ="Orders")
	@SequenceGenerator(allocationSize = 1,initialValue = 10231,name ="Orders")
	private int orderId;
	private LocalDate orderDate;
	private String orderStatus;
	
	@Embedded
	private Cart cart;
	
	
}
