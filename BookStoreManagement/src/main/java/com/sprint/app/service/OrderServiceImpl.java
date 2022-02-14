package com.sprint.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint.app.dto.CustomerBasicInfoDTO;
import com.sprint.app.entity.OrderBook;
import com.sprint.app.repository.IOrderRepository;

@Service
public class OrderServiceImpl implements IOrderService{

	@Autowired
	ICustomerService customerService;
	
	@Autowired
	IOrderRepository odrepo;
	
	@Override
	public CustomerBasicInfoDTO getCustomerByOrderId(int orderId) {
		
	
		return customerService.getCustomerByOrderId(orderId);
	}
	

	public List<OrderBook> getCustomerOrdersList(int id) {
		
		return odrepo.findAllById(id);
	}
}
