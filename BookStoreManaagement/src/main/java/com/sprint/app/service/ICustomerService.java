package com.sprint.app.service;

import java.util.List;

import com.sprint.app.entity.Book;
import com.sprint.app.entity.Customer;

public interface ICustomerService {

	public boolean createCustomer(Customer c);
	public List<Customer> listCustomers();
	public boolean deleteCustomer(Customer c);
	public boolean updateCustomer(Customer c);
	public Customer viewCustomer(Customer c);
	public List<Customer> listAllCustomersByBook(Book book);

	
}
