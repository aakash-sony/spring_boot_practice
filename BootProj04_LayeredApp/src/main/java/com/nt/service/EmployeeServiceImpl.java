package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeMgmtService {

	@Autowired
	private IEmployeeDAO employeeDAO;

	@Override
	public List<Employee> retriveEmployeesByDesg(String desg1, String desg2, String desg3) {
		desg1 = desg1.toUpperCase();
		desg2 = desg2.toUpperCase();
		desg3 = desg3.toUpperCase();
		
		return employeeDAO.fetchEmployeeByDesg(desg1, desg2, desg3);
	}

	@Override
	public String registerEmployee(Employee emp) {
		int count = employeeDAO.insertEmployee(emp);
		 return count == 0 ? "Employee registration failed..." : "Employee registered successfully...";
	}
}
