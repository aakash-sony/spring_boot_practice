package com.nt.service;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeMgmtService {
	public List<Employee> retriveEmployeesByDesg(String desg1, String desg2, String desg3);

	public String registerEmployee(Employee emp);
}
