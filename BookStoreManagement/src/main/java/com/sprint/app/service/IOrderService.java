package com.sprint.app.service;

import org.springframework.stereotype.Service;

import com.sprint.app.dto.CustomerBasicInfoDTO;

@Service
public interface IOrderService {
	
	public CustomerBasicInfoDTO getCustomerByOrderId(int orderId);
}
