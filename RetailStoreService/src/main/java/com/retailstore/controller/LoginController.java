package com.retailstore.controller;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.retailstore.bean.Customer;
import com.retailstore.service.CustomerService;




@Controller
@Scope("session")
public class LoginController {
	
	@Autowired
	private CustomerService customerService;
	

	@RequestMapping("/")
	public ModelAndView loginPageController() {
		return new ModelAndView("Login", "command", new Customer());
	}
	
	@RequestMapping("/registerpage")
	public ModelAndView registerPageController() {
		return new ModelAndView("Register", "command", new Customer());
	}
	

	@RequestMapping("/login")
	public ModelAndView loginController(@ModelAttribute Customer customer,HttpSession session) {
		
		ModelAndView modelAndView=new ModelAndView();
		if (customerService.getCustomer(customer.getUserName(), customer.getPassword()) != null) {
			modelAndView.addObject("customer", customer);  //customer object added at request scope			
			session.setAttribute("customer", customer);
			modelAndView.setViewName("index");
		}		
		else {
			modelAndView.addObject("message", "Invalid Credentials");
			modelAndView.addObject("command", new Customer());
			modelAndView.setViewName("Login");
		}
		return modelAndView;
	}
	
	@RequestMapping("/register")
	public ModelAndView registerController(@ModelAttribute Customer customer,HttpSession session) {
		
		ModelAndView modelAndView=new ModelAndView();
		if (customerService.saveCustomer(customer) != null) {	
			//transactionService.addtransaction(new Transaction(customer.getCustomer_ID(), customer.getCustomer_ID()));
			modelAndView.addObject("message", "Registration Successful");
			modelAndView.setViewName("registersuccess");
		}		
		else {
			modelAndView.addObject("message", "Incorrect Information, Please Try Again");
			modelAndView.setViewName("Register");
		}
		return modelAndView;
	}
	
	@RequestMapping("/Logout")
	public ModelAndView logoutController() {
		return new ModelAndView("Login", "command", new Customer());
	}

}
