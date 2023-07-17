package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Sushi {
	private @Id @GeneratedValue Long id;
	private String name;
	private double price;
	private String category;
	
	Sushi(){}
	
	Sushi(String name, double price, String category){
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public double getPrice(){
		return this.price;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public String getCategory(){
		return this.category;
	}
	
	public void setCategory(String category){
		this.category = category;
	}
}
