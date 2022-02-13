package com.sprint.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint.app.dto.CustomerBasicInfoDTO;

@Service
public class OrderServiceImpl implements IOrderService{

	@Autowired
	ICustomerService customerService;
	
	@Override
	public CustomerBasicInfoDTO getCustomerByOrderId(int orderId) {
		
	
		return customerService.getCustomerByOrderId(orderId);
	}

}
