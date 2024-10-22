package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IOrderDAO;
import com.nt.model.Order;

@Service
public class OrderOpServiceImpl implements IOrderOpService {

	@Autowired
	private IOrderDAO orderDAO;

	@Override
	public String addOrder(Order order) {
		Order result = orderDAO.save(order);
		return result != null ? "Order saved successfully" : "Something went wrong..";
	}

	@Override
	public List<Order> getAllOrder() {
		Iterable<Order> allOrder = orderDAO.findAll();
		return (List<Order>) allOrder;

	}

	@Override
	public String deleteOrderById(int id) {
		if (orderDAO.existsById(id)) {
			orderDAO.deleteById(id);
			return "Order deleted successfully...";
		} else {
			return "Something went wrong with ID: " + id;
		}
	}

	@Override
	public Order getOrderById(int id) {
		Order order = null;
		Optional<Order> optional = orderDAO.findById(id);
		if (optional.isPresent()) {
			order = optional.get();
		} else {
			System.out.println("Order not found with this id: " + id);
		}
		return order;
	}

	@Override
	public String updateOrderById(int id, Order updatedOrder) {
		if (orderDAO.existsById(id)) {
			updatedOrder.setId(id);
			orderDAO.save(updatedOrder);
			return "Order updated successfully...";
		} else {
			return "Something went wrong with ID: " + id;
		}
	}

	@Override
	public List<Order> findAllOrderByName(String name) {
		List<Order> allOrdersByName = orderDAO.findByCustomerName(name);
		 if (allOrdersByName.isEmpty()) {
		        System.out.println("No orders found for customer: " + name);
		    }
		return allOrdersByName;
	}
	
	 @Override
	    public boolean orderExistsById(int id) {
	        return orderDAO.existsById(id);
	    }

	@Override
	public List<Order> findOrdersByOrderDate(String date) {
		List<Order> byOrders_date = orderDAO.getOrdersByDate(date);
		if(byOrders_date.isEmpty()) {
			System.out.println("No orders found for this date..."+date);
		}
		return byOrders_date;
	}

	@Override
	public List<Order> findOrderByOrderDate(String date) {
		List<Order> orderByDate = orderDAO.getOrderByDate(date);
		if(orderByDate.isEmpty())
		{
			System.out.println("No orders found for this date..."+date);
		}
		return orderByDate;
	}

}
