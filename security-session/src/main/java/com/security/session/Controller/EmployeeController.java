package com.security.session.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.session.Entity.Employee;
import com.security.session.Service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController 
{
    @Autowired
	private EmployeeService EmployeeService;
    
    @PostMapping(value="/save")
	public Employee saveEmployee( @RequestBody Employee employee)
	{
		return EmployeeService.saveEmployee(employee);
	}
	
	@GetMapping(value="/getEmployee/{id}")
	public Employee getEmployee(@PathVariable("id") int id)
	{
		return EmployeeService.getEmployee(id);
	}
	
}
