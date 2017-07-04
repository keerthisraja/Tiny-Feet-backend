package com.niit.ecartbackend.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "product")
@Component
public class Product {

   
	@Id
	@GeneratedValue
	
	private String Id;
	
	
	private String Name;
	private String description;
	private int Price;
	private int Stock;
	
	
	
	public String getId() {
		return Id;
	}
	public void setProductId(String productId) {
		this.Id = Id;
	}
	public String getProductName() {
		return Name;
	}
	public void setProductName(String productName) {
		this.Name = Name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getProductPrice() {
		return Price;
	}
	public void setProductPrice(int product_Price) {
		this.Price = Price;
	}
	public int getProductStock() {
		return Stock;
	}
	public void setProductStock(int product_Stock) {
		this.Stock = Stock;
	}
}
	
	
	

	

