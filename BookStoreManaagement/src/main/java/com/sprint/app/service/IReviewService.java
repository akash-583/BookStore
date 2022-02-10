package com.sprint.app.service;

import java.util.List;

import com.sprint.app.entity.Book;
import com.sprint.app.entity.Customer;
import com.sprint.app.entity.Review;



public interface IReviewService {

	public List<Review> listAllReviews();
	public boolean addReview(Review review);
	public boolean deleteReview(Review review);
	public boolean updateReview(Review review);
	public Review viewReview(Review review);
	public List<Review> listAllReviewsByBook(Book book);
	public List<Review> listAllReviewsByCustomer(Customer c);
	public List<Book> listMostFavoredBooks();
}
