package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.OrderRequest;
import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.ProductRepository;
@RestController
public class OrderController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("/addCustomer")
	public Customer placeOrder (@RequestBody OrderRequest request) { 	
		return customerRepository.save(request.getCustomer());
		
	}
	@GetMapping("/fetchCustomer")
	public List<Customer>getAllCustoemer(){
		return customerRepository.findAll();
	}
	
	
	

}
