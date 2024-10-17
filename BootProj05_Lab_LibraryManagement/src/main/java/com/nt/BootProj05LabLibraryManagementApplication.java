package com.nt;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.BookOpController;

@SpringBootApplication
public class BootProj05LabLibraryManagementApplication {

	public static void main(String[] args) 
	{
		ApplicationContext ctx = SpringApplication.run(BootProj05LabLibraryManagementApplication.class, args);

		BookOpController controller = ctx.getBean(BookOpController.class);

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.print("1.\t Add Book\n");
			System.out.print("2.\t View All Book\n");
			System.out.print("3.\t Delete Book\n");
			System.out.print("4.\t Update Book\n");
			System.out.print("5.\t Exit");
			System.out.println("\n====================");
			System.out.print("\nSelect your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				controller.addBook();
				break;
			case 2:
				controller.findAllBook();
				break;
			case 3:
				controller.deleteBook();
				break;
			case 4:
				controller.updateBook();
				break;
			case 5:
				System.out.println("Exiting the application.");
				System.exit(0);
			default:
				System.out.println("Wrong input..Please try again..");
			}
		} while (choice != 5);

		sc.close();
	}
}
