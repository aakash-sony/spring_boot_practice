package com.nt.service;

import java.util.List;

import com.nt.model.Product;

public interface IProductMgmtService {
	public String save(Product product);
	public List<Product> retrieveAll();
	public String delete(int id);
	public String update(Product product);
	public Product retrieveById(int id);
}
