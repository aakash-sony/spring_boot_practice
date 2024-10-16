package com.nt.dao;

import java.util.List;

import com.nt.model.Product;

public interface IProductDao {
	public int insertProduct(Product product);
	public List<Product> getAllProducts();
	public int deleteProduct(int productId);
	public int updateProduct(Product product);
	public Product getProductById(int id);
}
