package com.sprint.app.service;

import java.util.List;
import com.sprint.app.entity.Book;

public interface IBookService {
	
	public boolean addBook(Book b);
	public List<Book> listAllBooks();
	public boolean deleteBook(String isbn);
	public Book viewBook(String name);
	public List<Book> listBooksByCategory(String cat);
}
