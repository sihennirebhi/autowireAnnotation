package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.Customer;

public class CustomerService {

	private static List<Customer> list = new ArrayList<Customer>();
	
	static {
		
		Customer c = new Customer();
		c.setId(1);
		c.setName("Ahmed");
		c.setAge(20);
		c.setLocation("Algeria");
		
		c = new Customer();
		c.setId(2);
		c.setName("Omar");
		c.setAge(20);
		c.setLocation("Algeria");
		
		c = new Customer();
		c.setId(3);
		c.setName("Othmane");
		c.setAge(20);
		c.setLocation("Algeria");
		
		
		
	}
}
