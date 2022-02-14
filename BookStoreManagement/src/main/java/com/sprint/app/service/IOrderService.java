package com.sprint.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sprint.app.dto.CustomerBasicInfoDTO;
import com.sprint.app.entity.OrderDetails;
import com.sprint.app.entity.PlaceOrder;

@Service
public interface IOrderService {
	
	public CustomerBasicInfoDTO getCustomerByOrderId(int orderId);
	public List<PlaceOrder> getCustomerOrdersList(int id);
	public List<OrderDetails> getAllOrders();
}
