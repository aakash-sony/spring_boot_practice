package com.nt.model;

import java.io.Serializable;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class Employee implements Serializable{
	private Integer employeeNo;
	private String employeeName;
	private String designation;
	private Double salary;
	private Integer deptNo;
}
