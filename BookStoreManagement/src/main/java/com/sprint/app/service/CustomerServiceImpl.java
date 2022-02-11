package com.sprint.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint.app.entity.Book;
import com.sprint.app.entity.Customer;
import com.sprint.app.repository.ICustomerServiceRepo;


@Service
public class CustomerServiceImpl implements ICustomerService{
	
	@Autowired
	ICustomerServiceRepo customer;

	@Override
	public boolean createCustomer(Customer c) {
		// TODO Auto-generated method stub
		customer.save(c);
		return true;
	}

	@Override
	public List<Customer> listCustomers() {
List<Customer> custlist=(List<Customer>) customer.findAll();
		
		if(custlist.size()==0) {
			return null;
		}
		return custlist;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		Customer cus=customer.findById(customerId).get();
		customer.delete(cus);
		return true;
	}

	@Override
	public boolean updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Customer viewCustomer(int customerid) {
		return customer.findById(customerid).get(); 
	}

	@Override
	public List<Customer> listAllCustomersByBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}
	

}