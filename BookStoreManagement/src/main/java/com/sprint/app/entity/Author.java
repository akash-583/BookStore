package com.sprint.app.entity;


import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Author {
	
	private String authorName;
	private String about;
	/**
	 * 
	 */
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param authorName
	 * @param about
	 */
	public Author(String authorName, String about) {
		this.authorName = authorName;
		this.about = about;
	}
	
	
}
