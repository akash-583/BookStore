package com.sprint.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint.app.dto.CustomerBasicInfoDTO;
import com.sprint.app.dto.CustomerBasicInfoDTOConversion;
import com.sprint.app.entity.Customer;
import com.sprint.app.entity.OrderDetails;
import com.sprint.app.entity.PlaceOrder;
import com.sprint.app.repository.ICustomerServiceRepo;
import com.sprint.app.repository.IOrderRepository;

@Service
public class OrderServiceImpl implements IOrderService{

	@Autowired
	ICustomerServiceRepo customerService;
	
	@Autowired
	IOrderRepository odrepo;
	
	@Override
	public CustomerBasicInfoDTO getCustomerByOrderId(int orderId) {
		
		int custId=odrepo.findById(orderId).get().getCustomerId();
		
		Customer c=customerService.findById(custId).get();
		
		CustomerBasicInfoDTOConversion dto=new CustomerBasicInfoDTOConversion();
		return dto.convertCustomer(c);
		
	}
	

	public List<PlaceOrder> getCustomerOrdersList(int id) {
		
		
		return null;
	}


	@Override
	public List<OrderDetails> getAllOrders() {
		
		List<OrderDetails> od=(List<OrderDetails>) odrepo.findAll();
		
		return od;
	}
}
