package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false,length = 100,name = "NAME")
	private String name;
	
	@Column(nullable=false,length = 100,name = "EMAIL")
	private String email ;
	
	@OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
	@JoinColumn(name="cf_p",referencedColumnName = "id")
	private List<Product> product;
	
	public List<Product> getProduct() {
		return product;
	}


	public Customer(int id, String name, String email, List<Product> product, String gender) {
	
		this.id = id;
		this.name = name;
		this.email = email;
		this.product = product;
		this.gender = gender;
	}


	public void setProduct(List<Product> product) {
		this.product = product;
	}

	@Column(length = 5,name="GENDER")
	private String gender;
	public Customer() {

	}
	

	public Customer(int id, String name, String email, String gender) {

		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	

}
