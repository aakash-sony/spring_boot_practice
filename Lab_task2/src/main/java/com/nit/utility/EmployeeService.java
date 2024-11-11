package com.nit.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.sbeans.Employee;

@Component
public class EmployeeService
{
	Scanner scanner = new Scanner(System.in);
	@Autowired
	private Employee employee;
	
	List<Employee> empList = new ArrayList<Employee>();
	
	public List<Employee> getAllemployees()
	{
		return empList;
	}
	public void addEmp(Employee e)
	{
		empList.add(e);	
	}
	
	public void fetchEmp(int id)
	{
		empList.stream().filter(e -> (e.getId()==id)).forEach(System.out::println);;
	}
	
	public void removeEmp(int id)
	{
		empList.removeIf(e -> (e.getId()==id));
		System.out.println("Successfully removed..");

	}
	
	public void updateEmp(Employee e, int id)
	{
		if(e.getId()==id)
		{
			System.out.print("Enter name for changing from "+e.getName()+" :");
			String name =scanner.nextLine();
			e.setName(name);
			
			System.out.println("Enter salary for changing from "+e.getSalary()+ ": ");
		    double salary = scanner.nextDouble();
		    e.setSalary(salary);
		}
		System.out.println("successfully updated...");
	}
	
}
