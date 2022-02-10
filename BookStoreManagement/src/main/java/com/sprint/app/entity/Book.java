package com.sprint.app.entity;

import java.time.LocalDate;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

	private int bookId;
	private String title;
	private String author;
	private Category category;
	private String description;
	private String isbn;
	private double price;
	private LocalDate publishDate;
	private LocalDate lastUpdatedOn;
	
}
