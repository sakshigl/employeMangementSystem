package com.globallogic.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.globallogic.model.Employee;

public class EmployeeDaoImp implements EmployeeDao {

	
	private JdbcTemplate  jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int insert(Employee employee) {
		//insrt query 
		String insertQuery="insert into employee(id,firstname,lastname,username,password,address,contactnum) values(?,?,?,?,?,?,?)";
		 int r=this.jdbcTemplate.update(insertQuery,employee.getId(),employee.getFirstname(),employee.getLastname(),employee.getUsername(),
				 employee.getPassword(),employee.getAddress(),employee.getContactnum());
		return r;
	}
	public List<Employee> list() {
		// TODO Auto-generated method stub
		return null;
	}
	public int saveEmployee(Employee employee) {
		String insertQuery="insert into employee(id,firstname,lastname,username,password,address,contactnum) values(?,?,?,?,?,?,?)";
		 int r=this.jdbcTemplate.update(insertQuery,employee.getId(),employee.getFirstname(),employee.getLastname(),employee.getUsername(),
				 employee.getPassword(),employee.getAddress(),employee.getContactnum());
		return r;
		
	}
	public int deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}
	public int updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

}
