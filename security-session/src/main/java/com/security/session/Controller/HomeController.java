package com.security.session.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController 
{
    @GetMapping("/home")
	public String home()
	{
		return "wolcome to home";
	}
    
    @GetMapping("/contect")
    public String contect()
    {
    	return "welcome to contect";
    }
    
    
    @GetMapping("/balancecheck")
    public String balance()
    {
    	return"your current balance 25000";
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
