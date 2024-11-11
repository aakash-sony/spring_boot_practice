package com.nt.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Product;
import com.nt.service.IProductMgmtService;

@Controller
public class ProductController {
	@Autowired
	private IProductMgmtService service;

	Scanner sc = new Scanner(System.in);

	public void addProduct() {
		System.out.print("Enter product name: ");
		String name = sc.nextLine();
		System.out.print("Enter product description: ");
		String desc = sc.nextLine();
		System.out.print("Enter product price: ");
		double price = sc.nextDouble();

		Product product = new Product();
		product.setName(name);
		product.setDescription(desc);
		product.setPrice(price);

		String result = service.save(product);
		System.out.println(result);
	}

	public void findAllProduct()
	{
		System.out.println("All Products:- ");
		List<Product> allProducts = service.retrieveAll();
		allProducts.forEach(product ->{
			System.out.println(product.getId()+" "+product.getName()+" "+product.getDescription()+" "+product.getPrice());
		});
	}
	
	public void deleteProduct()
	{
		System.out.print("Enter product id to delete: ");
		int id = sc.nextInt();
		
		String result = service.delete(id);
		System.out.println(result);
	}
	
	public void updateProduct()
	{
		System.out.print("Enter product id to update: ");
	    int id = sc.nextInt();
	    sc.nextLine();

	    System.out.print("Enter new product name: ");
	    String name = sc.nextLine();
	    
	    System.out.print("Enter new product description: ");
	    String desc = sc.nextLine();
	    
	    System.out.print("Enter new product price: ");
	    double price = sc.nextDouble();
	    
	    Product product = service.retrieveById(id);
	    if(product == null)
	    {
	    	System.out.println("Product not found..");
	    	return;
	    }
	    product.setName(name);
	    product.setDescription(desc);
	    product.setPrice(price);
	    	   
	   String result = service.update(product);
	   System.out.println(result);
	}
}
