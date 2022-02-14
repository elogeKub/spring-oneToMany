package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	@Column(name="DESIGNATION",length = 200,nullable=false)
	private String productName;
	@Column(name="PRICE",length = 40,nullable = false)
	private double price;
	@Column(name="QUANTITE",nullable=false,length = 50)
	private int quantite;

}
