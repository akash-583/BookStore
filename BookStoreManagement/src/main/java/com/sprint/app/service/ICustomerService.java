package com.sprint.app.service;

import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sprint.app.dto.CustomerBasicInfoDTO;
import com.sprint.app.entity.Customer;


@Service
public interface ICustomerService {
	
	public String createCustomer(Customer c);
	public List<Customer> listCustomers();
	public String deleteCustomer(int customerId);
	public String updateCustomer(Customer cust);
	public Customer viewCustomer(int customerId);
	public List<Customer> getCustomerByDate(Date date);
    public List<Customer> getCustomerByName(String name);
    public Customer getCustomerByPhoneNumber(long number);
    public CustomerBasicInfoDTO getCustomerByOrderId(int id);
}
