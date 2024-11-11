package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Product;

@Repository
public class ProductDaoImpl implements IProductDao {
	private final String INSERTION_QUERY = "INSERT INTO PRODUCT(name, descr, price) VALUES(?,?,?)";
	private final String RETRIEVE_QUERY = "SELECT * FROM PRODUCT";
	private final String DELETION_QUERY = "DELETE FROM PRODUCT WHERE ID = ?";
	private final String UPDATION_QUERY = "UPDATE PRODUCT SET Name=?, Descr=?, Price=? WHERE ID = ?";
	private final String RETRIEVE_ONE = "SELECT * FROM PRODUCT WHERE ID = ?";
	@Autowired
	private DataSource ds;

	@Override
	public int insertProduct(Product product) {
		int rowInserted = 0;
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(INSERTION_QUERY);
			ps.setString(1, product.getName());
			ps.setString(2, product.getDescription());
			ps.setDouble(3, product.getPrice());

			rowInserted = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowInserted;
	}
	

	@Override
	public List<Product> getAllProducts() {
		List<Product> productList = new ArrayList<Product>();;
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(RETRIEVE_QUERY);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt(1));
				product.setName(rs.getString(2));
				product.setDescription(rs.getString(3));
				product.setPrice(rs.getDouble(4));

				productList.add(product);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return productList;
	}

	@Override
	public int deleteProduct(int productId) {
		int deletedRow = 0;
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(DELETION_QUERY);
			ps.setInt(1, productId);
			
			deletedRow = ps.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return deletedRow;

	}


	@Override
	public int updateProduct(Product product) {
		int rowUpdated = 0;
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(UPDATION_QUERY);
			ps.setString(1, product.getName());
			ps.setString(2, product.getDescription());
			ps.setDouble(3, product.getPrice());
			ps.setInt(4, product.getId());
			
			rowUpdated = ps.executeUpdate();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return rowUpdated;
	}


	@Override
	public Product getProductById(int id) {
		Product product = null;
		try
		{
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(RETRIEVE_ONE);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				product = new Product();
				product.setId(rs.getInt(1));
				product.setName(rs.getString(2));
				product.setDescription(rs.getString(3));
				product.setPrice(rs.getDouble(4));
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return product;
	}

}
