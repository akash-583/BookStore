package com.sprint.app.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sprint.app.entity.OrderDetails;

@Repository
public interface IOrderRepository extends CrudRepository<OrderDetails, Integer>{


}
