package com.sprint.app.repository;

import java.util.Date;
import java.util.List;
import com.sprint.app.entity.Customer;

public interface CustomCustomerRepository {
	
	public List<Customer> getCustomerByDate(Date date);
    public List<Customer> getCustomerByName(String fullName);
    public Customer getCustomerByPhoneNumber(long number);
}
