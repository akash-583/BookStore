package com.sprint.app.entity;

import java.util.List;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class Cart {
	
	private String customerName;
	private List<Book> books;
}
