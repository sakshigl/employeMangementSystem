package com.globallogic.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.globallogic.dao.EmployeeDao;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com.globallogic.model.mvc-dispatcher-servlet.xml");
		 
		EmployeeDao employeeDao= context.getBean("employeedao",EmployeeDao.class);
		
		Employee employee=new Employee();
		employee.setId(345);
		
	}

}
