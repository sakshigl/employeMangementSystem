package com.globallogic.dao;

import java.util.List;

import com.globallogic.model.Employee;

public interface EmployeeDao {
	public int insert(Employee employee);

	public List<Employee> list();

	public int saveEmployee(Employee employee);
	
	public int deleteEmployee(Employee employee);
	
	public int updateEmployee(Employee employee);

}
