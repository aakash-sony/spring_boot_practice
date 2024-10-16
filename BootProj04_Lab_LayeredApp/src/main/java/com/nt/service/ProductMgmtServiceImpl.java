package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IProductDao;
import com.nt.model.Product;

@Service
public class ProductMgmtServiceImpl implements IProductMgmtService {

	@Autowired
	private IProductDao productDao;

	@Override
	public String save(Product product) {

		int insertProduct = productDao.insertProduct(product);
		return insertProduct != 0 ? "Product added successfully" : "Something went wrong";
	}

	@Override
	public List<Product> retrieveAll() {
		return productDao.getAllProducts();
	}

	@Override
	public String delete(int id) {
		int deleteProduct = productDao.deleteProduct(id);
		return deleteProduct != 0? "Product deleted Successfully..":"Something went wrong..";
	}

	@Override
	public String update(Product product) {
		int updateProduct = productDao.updateProduct(product);
		return updateProduct != 0 ? "Product updated successfully..":"Something went wrong..";
	}

	@Override
	public Product retrieveById(int id) {
		return productDao.getProductById(id);
	}

}
