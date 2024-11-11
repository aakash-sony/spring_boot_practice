package com.nt;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.ProductController;

@SpringBootApplication
public class BootProj04LabLayeredAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj04LabLayeredAppApplication.class, args);

		ProductController controller = ctx.getBean(ProductController.class);

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.print("1.\t Add Product\n");
			System.out.print("2.\t View All Product\n");
			System.out.print("3.\t Delete Product\n");
			System.out.print("4.\t Update Product\n");
			System.out.print("5.\t Exit");
			System.out.println("\n====================");
			System.out.print("\nSelect your choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				controller.addProduct();
				break;
			case 2:
				controller.findAllProduct();
				break;
			case 3:
				controller.deleteProduct();
				break;
			case 4:
				controller.updateProduct();
				break;
			case 5:
				System.out.println("Exiting the application.");
				System.exit(0);
			default:
				System.out.println("Wrong input..Please try again..");
			}
		} while (choice !=5);

		sc.close();
	}
}
