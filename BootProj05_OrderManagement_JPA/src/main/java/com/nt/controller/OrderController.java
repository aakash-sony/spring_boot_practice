package com.nt.controller;

import java.util.List;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Order;
import com.nt.service.OrderOpServiceImpl;

@Controller
public class OrderController {

	@Autowired
	private OrderOpServiceImpl service;

	Scanner scanner = new Scanner(System.in);

	public void addOrder() {
		System.out.print("Enter Order date: ");
		String date = scanner.nextLine();
		System.out.print("Enter Customer Name: ");
		String name = scanner.nextLine();
		System.out.print("Enter Total Amount: ");
		double amount = scanner.nextDouble();

		Order order = new Order();
		order.setOrder_date(date);
		order.setCustomerName(name);
		order.setTotal_amount(amount);

		String result = service.addOrder(order);
		System.out.println(result);
	}

	public void retrieveAllOrder() {

		List<Order> allOrder = service.getAllOrder();
		allOrder.forEach(System.out::println);
	}
	
	public void retrieveById()
	{
		System.out.print("Enter id to get the Order: ");
		int id = scanner.nextInt();
		
		Order order = new Order();
		order.setId(id);
		Order orderById = service.getOrderById(id);
		System.out.println(orderById);
	}
	
	public void deleteOrderById()
	{
		System.out.print("Enter Id to delete the order: ");
		int id = scanner.nextInt();
		
		String result = service.deleteOrderById(id);
		System.out.println(result);
	}
	
	public void updateOrderById() {
	    System.out.print("Enter ID of the order to update: ");
	    int id = scanner.nextInt();
	    scanner.nextLine(); 
	    
	    if (!service.orderExistsById(id)) {
            System.out.println("Invalid ID: " + id);
            return;
        }
	    
	    System.out.print("Enter new Order date: ");
	    String date = scanner.nextLine();
	    System.out.print("Enter new Customer Name: ");
	    String name = scanner.nextLine();
	    System.out.print("Enter new Total Amount: ");
	    double amount = scanner.nextDouble();

	    Order updatedOrder = new Order();
	    updatedOrder.setOrder_date(date);
	    updatedOrder.setCustomerName(name);
	    updatedOrder.setTotal_amount(amount);

	    String result = service.updateOrderById(id, updatedOrder);
	    System.out.println(result);
	}
	
	public void findAllOrdersByName()
	{
		System.out.print("Enter name to find the Orders: ");
		String name = scanner.nextLine();
		
		List<Order> allOrderByName = service.findAllOrderByName(name);
		allOrderByName.forEach(System.out::print);	
	}
	
	public void findOrdersByOrderDate()
	{
		System.out.print("Enter date to find the order list: ");
		String date = scanner.nextLine();
		
		List<Order> ordersByOrderDate = service.findOrdersByOrderDate(date);
		ordersByOrderDate.forEach(order ->{
			System.out.println(order);
		});
	}
	
	public void findOrderByOrderDate()
	{
		System.out.print("Enter date to find the order list: ");
		String date = scanner.nextLine();
		
		List<Order> ordersByOrderDate = service.findOrderByOrderDate(date);
		ordersByOrderDate.forEach(order ->{
			System.out.println(order);
		});
	}
}
