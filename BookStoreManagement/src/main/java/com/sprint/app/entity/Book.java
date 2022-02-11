package com.sprint.app.entity;

import java.time.LocalDate;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

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

	@Id
	private int isbn;
	private String title;

	private String category;
	private String description;
	private double price;
	private LocalDate publishDate;
	private LocalDate lastUpdatedOn;
	private float rating;
	
	@Embedded
	private Author author;
	
}
