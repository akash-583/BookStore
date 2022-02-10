package com.sprint.app.service;

import com.sprint.app.entity.Category;

public interface ICategoryService {

	public Category addCategory(String categoryName);
	public Category editCategory(Category cat);
	public Category viewAllCategories();
	public Category removeCategory(Category cat);
}
