package com.sprint.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sprint.app.entity.OrderBook;
import com.sprint.app.entity.OrderDetails;

@Repository
public interface IOrderRepository extends CrudRepository<OrderDetails, Integer>{

	List<OrderBook> findAllById(int id);

}
