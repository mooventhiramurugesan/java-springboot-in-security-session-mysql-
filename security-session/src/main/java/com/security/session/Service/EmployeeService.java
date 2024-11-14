package com.security.session.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.security.session.Entity.Employee;
import com.security.session.SecurityRepository.SecurityRepository;

@Service
public class EmployeeService 
{
    @Autowired
	private SecurityRepository SecurityRepository;
    
    public Employee saveEmployee(Employee employee)
	{
		Employee savedEmployee=SecurityRepository.save(employee);
		return savedEmployee;
	}
    

	public Employee getEmployee(int id)
	{
		return  SecurityRepository.findById(id).get();
			
	}
}
