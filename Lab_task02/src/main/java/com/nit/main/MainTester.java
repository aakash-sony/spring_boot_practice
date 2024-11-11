package com.nit.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.confg.AppConfg;
import com.nit.sbeans.Employee;
import com.nit.utility.EmployeeService;

public class MainTester {
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfg.class);
		Employee emp1 = ctx.getBean(Employee.class);
		emp1.setId(101);
		emp1.setName("Akash Soni");
		emp1.setDesignation("Manager");
		emp1.setSalary(124000);
		
		Employee emp2 = ctx.getBean(Employee.class);
		emp2.setId(102);
		emp2.setName("Vikas Soni");
		emp2.setDesignation("CEO");
		emp2.setSalary(154000);
		
		Employee emp3 = ctx.getBean(Employee.class);
		emp3.setId(103);
		emp3.setName("Vishal Soni");
		emp3.setDesignation("Clerk");
		emp3.setSalary(110000);
		
		EmployeeService employeeService = ctx.getBean(EmployeeService.class);
		employeeService.addEmp(emp1);
		employeeService.addEmp(emp2);
		employeeService.addEmp(emp3);
		
		List<Employee> allemployees = employeeService.getAllemployees();
		System.out.println(allemployees); 
		
		System.out.println("======================================");
		employeeService.fetchEmp(103);
		System.out.println("=======================================");
		employeeService.removeEmp(101);
		System.out.println("======================================");
		employeeService.updateEmp(emp3, emp3.getId());
		System.out.println(allemployees); 
		
	}

}
