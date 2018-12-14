package com.globalmatics.bike.models;

import java.math.BigDecimal;
import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bikes")
public class Bike {

	@Id
	private String id;
	private String name;
	private String email;
	private String phone;
	private String model;
	private BigDecimal purchasePrice;
	private Date purchaseDate;
	private boolean contact;

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public boolean isContact() {
		return contact;
	}

	public void setContact(boolean contact) {
		this.contact = contact;
	}
	
	@Override
	public String toString() {
		return "Bikes{" +
				"id='" + id + '\''+
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", model='" + model + '\'' +
                ", purchasePrice='" + purchasePrice + '\'' +
                ", purchaseDate='" + purchaseDate + '\'' +
                ", contact=" + contact +
                '}';
	}

}
