package com.globallogic.controller;

import java.util.List;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContext;
import org.springframework.web.servlet.view.RedirectView;

import com.globallogic.dao.EmployeeDao;
import com.globallogic.model.Employee;
import com.globallogic.service.EmployeeService;

@Controller
public class MainController {
	
	private EmployeeDao employeedao;
	
	@RequestMapping( value="/gethome",method=RequestMethod.GET)
	
	
	public String gethome(){
		return "index";
	}

	//Create employee
	public ModelAndView listEmployee(ModelAndView model){
		
		List<Employee> listEmployee=employeedao.list();
		model.addObject("listEmployee",listEmployee);
		model.setViewName("index");
		return model;
	}
	
	//insert employee
	 
	@RequestMapping(value="/new",method=RequestMethod.GET)
	public ModelAndView newEmployee(ModelAndView model){
		Employee newEmployee = new Employee();
		
		model.addObject("employee",newEmployee);
		model.setViewName("add_emp_form");
		return model;
		
	}
	 
	//save
	@RequestMapping(value="/save",method=RequestMethod.GET)
	public ModelAndView saveEmployee(@ModelAttribute Employee employee){
		employeedao.save(employee);
		return new ModelAndView("redirect:/");
	}
	 
	//update
	
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public ModelAndView updateEmployee(@ModelAttribute Employee employee){
		Integer id=Integer.parseInt(RequestContext.getParameter("id"));
		Employee e=new Employee();
		id=e.getId();
		return new ModelAndView("index");
		return model;
		
	}
		
	//update
	
		@RequestMapping(value="/save",method=RequestMethod.GET)
		public ModelAndView deleteEmployee(@ModelAttribute Employee employee){
			
			return new ModelAndView("index");
			return model;
	
}

