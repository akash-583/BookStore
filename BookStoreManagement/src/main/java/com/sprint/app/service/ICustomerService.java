package com.sprint.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sprint.app.entity.Book;
import com.sprint.app.entity.Customer;


@Service
public interface ICustomerService {
	
	public boolean createCustomer(Customer c);
	public List<Customer> listCustomers();
	public boolean deleteCustomer(int customerId);
	public boolean updateCustomer(Customer c);
	public Customer viewCustomer(int customerId);
	public List<Customer> listAllCustomersByBook(Book book);

}
