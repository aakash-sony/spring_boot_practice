package com.nt.service;

import java.util.List;

import com.nt.model.Order;

public interface IOrderOpService {
	public String addOrder(Order order);
    
	public List<Order> getAllOrder();

	public Order getOrderById(int id);

	public String deleteOrderById(int id);

	public String updateOrderById(int id, Order updatedorder);
	
	public List<Order> findAllOrderByName(String name);
	
	boolean orderExistsById(int id);
	
	public List<Order> findOrdersByOrderDate(String date);
	
	public List<Order> findOrderByOrderDate(String date);
}
