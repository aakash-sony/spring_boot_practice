package com.nt.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.EmployeeServiceImpl;

@Controller
public class EmployeeOperationController {
	Scanner sc = new Scanner(System.in);

	@Autowired
	private EmployeeServiceImpl service;

	public void addEmployee() {

		System.out.print("Enter Employee ID: ");
		int empId = sc.nextInt();

		System.out.print("Enter Employee Name: ");
		String empName = sc.nextLine();
        empName = sc.nextLine();
		
        System.out.print("Enter Employee Designation: ");
		String empDesignation = sc.nextLine();

		System.out.print("Enter Employee Salary: ");
		double salary = Double.parseDouble(sc.nextLine());

		System.out.print("Enter Employee Department(10,20,30): ");
		int departmentNo = sc.nextInt();

		Employee employee = new Employee();
		employee.setEmployeeNo(empId);
		employee.setEmployeeName(empName);
		employee.setDesignation(empDesignation);
		employee.setSalary(salary);
		employee.setDeptNo(departmentNo);

		String registerEmployee = service.registerEmployee(employee);
		System.out.println(registerEmployee);
	}

	public void getEemployeeByDesg() {
		System.out.println("\nRetrieve Employee By designation(Clerk,Manager,Analyst,Salesman):-\n");
		System.out.print("Enter designation 1: ");
		String desg1 = sc.nextLine();
		desg1 = sc.nextLine();
		
		System.out.print("Enter designation 2: ");
		String desg2 = sc.nextLine();
		
		System.out.print("Enter designation 3: ");
		String desg3 = sc.nextLine();

		List<Employee> retriveEmployeesByDesg = service.retriveEmployeesByDesg(desg1, desg2, desg3);

		retriveEmployeesByDesg.forEach(emp -> {
			System.out.println(emp.getEmployeeNo() + " " + emp.getEmployeeName() + " " + emp.getDesignation() + " "
					+ emp.getSalary() + " " + emp.getDeptNo());
		});
	}
}
