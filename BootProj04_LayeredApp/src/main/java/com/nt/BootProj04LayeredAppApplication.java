package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.EmployeeOperationController;

@SpringBootApplication
public class BootProj04LayeredAppApplication {
	
	public static void main(String[] args) {
	ApplicationContext ctx	= SpringApplication.run(BootProj04LayeredAppApplication.class, args);
	
	EmployeeOperationController bean = ctx.getBean(EmployeeOperationController.class);
	//insert employee in database
	    bean.addEmployee();
	    
	 //retrieve employee from database   
	    bean.getEemployeeByDesg();
	}

	
}
