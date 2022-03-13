package com.sprint.app.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sprint.app.dto.CustomerBasicInfoDTO;
import com.sprint.app.entity.Customer;
import com.sprint.app.exception.CustomerNotFound;
import com.sprint.app.repository.ICustomerServiceRepo;


@Service
public class CustomerServiceImpl implements ICustomerService{
	
	@Autowired
	ICustomerServiceRepo customerRepo;
	
	
	@Override
	public String  createCustomer(Customer c) {
		// TODO Auto-generated method stub
		customerRepo.save(c);
		return "Customer Profile Created";
	}

	@Override
	public List<Customer> listCustomers() {
		List<Customer> custlist=(List<Customer>) customerRepo.findAll();
		
		if(custlist.size()==0) {
			return null;
		}
		return custlist;
	}

	@Override
	public Customer viewCustomer(int customerid) {
		return customerRepo.findById(customerid).get(); 
	}

	@Override
	public List<Customer> getCustomerByDate(Date date) {
	return customerRepo.getCustomerByDate(date);
	}

	/*@Override
	public List<Customer> getCustomerByName(String name) {
		// TODO Auto-generated method stub
		
		return customerRepo.getCustomerByName(name);
	}*/

	@Override
	public Customer getCustomerByPhoneNumber(long number) {
		// TODO Auto-generated method stub
		return customerRepo.getCustomerByPhoneNumber(number);
	}

	@Override
	public CustomerBasicInfoDTO getCustomerByOrderId(int id) {
		
		return null;
	}

	@Override
	public String deleteCustomer(int customerId) {
		
		customerRepo.deleteById(customerId);
		return "Customer Deleted";
	}

	@Override
	public String updateCustomer(Customer cust) {
		
		customerRepo.save(cust);
		return "Customer Updated";
	}

	@Override
	public List<Customer> getCustomerByName(String name) {
		// TODO Auto-generated method stub
		return customerRepo.getCustomerByName(name);
	}

	/*
	 * @Override public CustomerBasicInfoDTO getCustomerByOrderId(int id) {
	 * 
	 * List<Customer> custlist=(List<Customer>) customer.findAll(); Customer c=new
	 * Customer(); for(int i=0;i<custlist.size();i++) {
	 * 
	 * List<OrderBook> orders=new ArrayList<OrderBook>();
	 * orders=custlist.get(i).getOrdersList();
	 * 
	 * while(orders.size()>=0) { if(orders.get(i).getOrderId()==id) { int
	 * cusId=orders.get(i).getCustomerId(); c=customer.findById(cusId).get(); break;
	 * } }
	 * 
	 * }
	 * 
	 * CustomerBasicInfoDTOConversion conversion =new
	 * CustomerBasicInfoDTOConversion(); return conversion.convertCustomer(c);
	 * 
	 * }
	 */


	

}
