package com.sprint.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.sprint.app.entity.Customer;
import com.sprint.app.repository.*;
import com.sprint.app.service.CustomerServiceImpl;





@SpringBootTest
public class CustomerTest {
	@Mock
	CustomerServiceImpl customerservice;
	private AutoCloseable closeable;
	@BeforeEach

	void initService() {
		closeable=MockitoAnnotations.openMocks(this);
		customerservice=mock(CustomerServiceImpl.class);
	}
	@AfterEach
	void closeService() throws Exception {
		closeable.close();
	}
	@Test
	void getCustomerByPhonetest() {
		Customer customer=new Customer();
		when(customerservice.getCustomerByPhoneNumber(182475963)).thenReturn(customer);
		assertEquals(customer,customerservice.getCustomerByPhoneNumber(182475963));
	} 
	/*@Test
	void deleteCustomertest() 
	{
		Customer customer1=new Customer();
		customer1.setCustomerId(123);
		when(customerservice.deleteCustomer(123)).thenReturn(customer1);
		assertEquals(customer1, customerservice.deleteCustomer(123));
	}
	@Test
	void createCustomer(Customer c)
	{
		Customer customer=new Customer();
		when(customerservice.createCustomer(any(Customer.class))).thenReturn(customer);
		assertEquals(customer, customerservice.addCar());
	}*/
	
}
