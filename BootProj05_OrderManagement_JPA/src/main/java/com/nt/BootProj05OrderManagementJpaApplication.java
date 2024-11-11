package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.OrderController;

@SpringBootApplication
public class BootProj05OrderManagementJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj05OrderManagementJpaApplication.class, args);
		OrderController bean = ctx.getBean(OrderController.class);
//		bean.addOrder();
		System.out.println("********************");
		bean.retrieveAllOrder();
//		System.out.println("********************");
//		bean.deleteOrderById();
//		System.out.println("********************");
//		bean.retrieveById();
//		System.out.println("********************");
//		bean.updateOrderById();
//		System.out.println("*********************");
//		bean.findAllOrdersByName();
//		System.out.println("**********************");
		bean.findOrdersByOrderDate();
		System.out.println("***********************");
		bean.findOrderByOrderDate();
	}

}
