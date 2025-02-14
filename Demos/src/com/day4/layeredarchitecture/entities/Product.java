package com.day4.layeredarchitecture.entities;

import java.time.LocalDate;

import com.day4.layeredarchitecture.entities.Category;

public class Product {
	private int id;
	private double price;
	private String brand;
	
	private String description;
	private String manufacturer;
	private LocalDate dateOfMfg;
	private LocalDate bestTill;
	private Category category;
	public Product(int id, double price, String brand, String description, String manufacturer, LocalDate dateOfMfg,
			LocalDate bestTill, Category category) {
		super();
		this.id = id;
		this.price = price;
		this.brand = brand;
		this.description = description;
		this.manufacturer = manufacturer;
		this.dateOfMfg = dateOfMfg;
		this.bestTill = bestTill;
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", price=" + price + ", brand=" + brand + ", description=" + description
				+ ", manufacturer=" + manufacturer + ", dateOfMfg=" + dateOfMfg + ", bestTill=" + bestTill
				+ ", category=" + category + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public LocalDate getDateOfMfg() {
		return dateOfMfg;
	}
	public void setDateOfMfg(LocalDate dateOfMfg) {
		this.dateOfMfg = dateOfMfg;
	}
	public LocalDate getBestTill() {
		return bestTill;
	}
	public void setBestTill(LocalDate bestTill) {
		this.bestTill = bestTill;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Product(int id, double price, String brand) {
		super();
		this.id = id;
		this.price = price;
		this.brand = brand;
	}

}
