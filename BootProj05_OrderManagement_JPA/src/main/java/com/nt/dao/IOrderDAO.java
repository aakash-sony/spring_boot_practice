package com.nt.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nt.model.Order;

public interface IOrderDAO extends CrudRepository<Order, Integer>{
         public List<Order> findByCustomerName(String name);
}
