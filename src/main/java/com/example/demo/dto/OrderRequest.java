package com.example.demo.dto;

import com.example.demo.entity.Customer;

public class OrderRequest {
	private Customer customer;

	
	
	public OrderRequest(Customer customer) {
		
		this.customer = customer;
	}

	public OrderRequest() {
		
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	

}
