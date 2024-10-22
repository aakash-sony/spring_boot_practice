package com.nt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.nt.model.Order;

public interface IOrderDAO extends CrudRepository<Order, Integer> {
	public List<Order> findByCustomerName(String name);

	// JPQL
	@Query("Select o from Order o where o.order_date =:d")
	public List<Order> getOrdersByDate(@Param("d") String date);

	// native
	@Query(value = "Select * from Order65 where order_date =:date", nativeQuery = true)
	public List<Order> getOrderByDate(@Param("date") String date);
}
