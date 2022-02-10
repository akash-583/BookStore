package com.sprint.app.service;

import java.util.List;

import com.sprint.app.entity.Book;
import com.sprint.app.entity.Customer;
import com.sprint.app.entity.OrderDetails;


public interface IOrderService {

	public List<OrderDetails> listAllOrders();
	public List<OrderDetails> listOrderByCustomer(Customer cs);
	public OrderDetails viewOrderForCustomer(OrderDetails od);
	public OrderDetails viewOrderForAdmin(OrderDetails od);
	public boolean cancelOrder(OrderDetails od);
	public boolean addOrder(OrderDetails od);
	public boolean updateOrder(OrderDetails od);
	public List<OrderDetails> viewOrderByBook(Book book);
	public List<Book> listBestSellingBook();

}
