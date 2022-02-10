package com.sprint.app.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.sprint.app.entity.Book;
import com.sprint.app.service.IBookService;

@RestController
@RequestMapping("/store/bookdetails")
public class BookController {
	
	@Autowired
	IBookService bookService;

	@GetMapping("/book")
	public Book getBook(@RequestParam int isbn) {
		
		return bookService.getBook(isbn);
	}
	
	@PostMapping("/book")
	public boolean addBook(@RequestBody Book b) {
		
		return bookService.addBook(b);
	}
	
	@GetMapping("/books")
	public List<Book> listAllBook(){
		
		return bookService.listAllBooks();
	}
	

}
