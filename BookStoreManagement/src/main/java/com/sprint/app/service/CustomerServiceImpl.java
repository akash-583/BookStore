package com.sprint.app.service;

import java.util.ArrayList;
import java.util.Date;
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
	public String  createCustomer(Customer c) {
		// TODO Auto-generated method stub
		customer.save(c);
		return "Customer Profile Created";
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
	public String deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		customer.deleteById(customerId);
		return "Customer Profile Delete";
	}

	@Override
	public String updateCustomer(Customer c) {
		customer.save(c);
		return "Done";
	}

	@Override
	public Customer viewCustomer(int customerid) {
		return customer.findById(customerid).get(); 
	}

	@Override
	public List<Customer> getCustomerByDate(Date date) {
	return customer.getCustomerByDate(date);
	}

	@Override
	public Customer getCustomerByName(String name) {
		// TODO Auto-generated method stub
		
		return customer.getCustomerByName(name);
	}

	@Override
	public Customer getCustomerByPhoneNumber(long number) {
		// TODO Auto-generated method stub
		return customer.getCustomerByPhoneNumber(number);
	}


	

}
