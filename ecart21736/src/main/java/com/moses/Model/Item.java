package com.moses.Model;

import java.time.LocalDate;

public class Item {

	private int code;
	private String name;
	private String brandUnit;
	private Double unitPrice;
	private String quantity;
	private LocalDate registrationDate;
	
	
	
	public Item() {
		super();
	}

	public Item(int code, String name, String brandUnit, Double unitPrice, String quantity, LocalDate registrationDate) {
		super();
		this.code = code;
		this.name = name;
		this.brandUnit = brandUnit;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.registrationDate = registrationDate;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrandUnit() {
		return brandUnit;
	}

	public void setBrandUnit(String brandUnit) {
		this.brandUnit = brandUnit;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	@Override
	public String toString() {
		return "Item [code=" + code + ", name=" + name + ", brandUnit=" + brandUnit + ", unitPrice=" + unitPrice
				+ ", quantity=" + quantity + ", registrationDate=" + registrationDate + "]";
	}
	
	
	
}
