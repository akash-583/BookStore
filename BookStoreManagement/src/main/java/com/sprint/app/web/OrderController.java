package com.sprint.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sprint.app.dto.CustomerBasicInfoDTO;
import com.sprint.app.entity.OrderDetails;
import com.sprint.app.service.IOrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	IOrderService odService;
	
	
	
	@GetMapping("/order")
	public CustomerBasicInfoDTO getCustomerByOrderId(@RequestParam int id)
	{
		return odService.getCustomerByOrderId(id);
	}
	
	
	@GetMapping("/details")
	public OrderDetails getCustomerOrderDetails(@RequestParam int id) {
		
		
		return null;
	}

}
