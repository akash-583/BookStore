package com.sprint.app.web;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sprint.app.entity.Customer;
import com.sprint.app.service.ICustomerService;

@RestController
@RequestMapping("/customerprofile")
public class CustomerWebController {
	
	@Autowired
	ICustomerService cust;
	
	@PostMapping("/newcustomer")
	public String createCustomer(@RequestBody Customer customer)
	{
		return cust.createCustomer(customer);
	}
	
	@DeleteMapping("/customer")
	public String deleteCustomer(@RequestParam int customerid)
	{
	     cust.deleteCustomer(customerid);
	     return "Customer deleted";
	}
	
	@GetMapping("/customerslist")
	public List<Customer> listCustomers()
	{
		return cust.listCustomers();
	}
	
	@PutMapping("/customer")
	public Customer updateCustomer(@RequestBody Customer customer)
	{
		 cust.updateCustomer(customer);
		 return customer;
	}
	@GetMapping("/profile")
	public Customer viewCustomer(@RequestParam int id)
	{
		return cust.viewCustomer(id);
	}
	@GetMapping("/customerbyname")
	public List<Customer> getCustomerByName(@RequestParam String fullname)
	{
		return cust.getCustomerByName(fullname);
	}
	@GetMapping("/customerbydate")
	public List<Customer> getCustomerByDate(@RequestParam Date date)
	{
		return cust.getCustomerByDate(date);
	}
	@GetMapping("/customerbyphone")
	public Customer getCustomerByPhoneNumber(@RequestParam int number)
	{
		return cust.getCustomerByPhoneNumber(number);
	}

}
