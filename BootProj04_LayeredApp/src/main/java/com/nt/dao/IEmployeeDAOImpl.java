package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository
public class IEmployeeDAOImpl implements IEmployeeDAO {
	private static final String GET_EMPS_BY_DESGS = "SELECT EMPNO, ENAME, DESG, SAL, DEPTNO FROM EMP WHERE DESG IN (?, ?, ?) ORDER BY DESG";
	private static final String INSERT_EMP = "INSERT INTO EMP (EMPNO, ENAME, DESG, SAL, DEPTNO) VALUES (?,?,?,?,?)";
	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> fetchEmployeeByDesg(String desg1, String desg2, String desg3) {
		List<Employee> list = new ArrayList<Employee>();

		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(GET_EMPS_BY_DESGS);

			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Employee employee = new Employee();
				employee.setEmployeeNo(rs.getInt(1));
				employee.setEmployeeName(rs.getString(2));
				employee.setDesignation(rs.getString(3));
				employee.setSalary(rs.getDouble(4));
				employee.setDeptNo(rs.getInt(5));

				list.add(employee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public int insertEmployee(Employee emp) {
		int rowInserted = 0;
		try
		{
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(INSERT_EMP);
			ps.setInt(1, emp.getEmployeeNo());
			ps.setString(2, emp.getEmployeeName().toUpperCase());
			ps.setString(3, emp.getDesignation().toUpperCase());
			ps.setDouble(4, emp.getSalary());
			ps.setInt(5, emp.getDeptNo());
			
			rowInserted = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rowInserted;
	}

}
