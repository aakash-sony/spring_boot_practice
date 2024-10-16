package com.nit.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("com/nit/commons/foodOrdering.properties")
public class Order {

	@Value("${order.id}")
	private int orderId;
	@Value("${order.date}")
	private String orderDate;
	@Autowired
	private FoodItem orderedItem;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public FoodItem getOrderedItem() {
		return orderedItem;
	}

	public void setOrderedItem(FoodItem orderedItem) {
		this.orderedItem = orderedItem;
	}

	public double calculateTotal() {
		double totalBill = orderedItem.getFoodPrice();
		return totalBill;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", orderedItem=" + orderedItem + "]";
	}
	
	
}
