package com.sprint.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint.app.entity.Book;
import com.sprint.app.repository.IBookServiceRepo;

@Service
public class BookServiceImpl implements IBookService{
	
	@Autowired
	IBookServiceRepo bookrepo;

	@Override
	public boolean addBook(Book b) {
		
		bookrepo.save(b);
		return true;
	}

	@Override
	public List<Book> listAllBooks() {
	
		List<Book> bookList=(List<Book>) bookrepo.findAll();
		
		if(bookList.size()==0) {
			return null;
		}
		return bookList;
	}

	@Override
	public boolean deleteBook(int isbn) {
		
		Book b=bookrepo.findById(isbn).get();
		bookrepo.delete(b);
		return false;
	}

	@Override
	public Book viewBook(String name) {
		
		//Custom Repository need to be added
		return null;
	}

	@Override
	public List<Book> listBooksByCategory(String cat) {
		
		//Custom Repository
		return null;
	}

	@Override
	public Book getBook(int isbn) {
		
		return bookrepo.findById(isbn).get();
	}
	
	
}
