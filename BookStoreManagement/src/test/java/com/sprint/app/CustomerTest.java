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
import com.sprint.app.dto.*;
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
	
	@Test
	void getCustomerByNametest() {
		Customer customer=new Customer();
		when(customerservice.getCustomerByName("Akash")).thenReturn(customer);
		assertEquals(customer,customerservice.getCustomerByName("Akash"));
	} 
	@Test
	void viewCustomertest() 
	{
		Customer customer1=new Customer();
		customer1.setCustomerId(123);
		when(customerservice.viewCustomer(123)).thenReturn(customer1);
		assertEquals(customer1, customerservice.viewCustomer(123));
	}
	@Test
	void getCustomerByPhoneNumbertest() 
	{
		Customer customer2=new Customer();
		when(customerservice.getCustomerByPhoneNumber(12322554)).thenReturn(customer2);
		assertEquals(customer2, customerservice.getCustomerByPhoneNumber(12322554));
	}

	
}
