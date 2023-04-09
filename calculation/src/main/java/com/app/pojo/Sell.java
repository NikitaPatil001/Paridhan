package com.app.pojo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Table(name = "sell")
@Entity
public class Sell {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int srNo;
	private LocalDate date;
	@Column(length = 20)
	private String customerName;
	@Column(length = 20)
	private String itemName;
	private int quantity;
	private int unitPrice;
	@JsonIgnore
	private int totalAmount;

	public Sell(LocalDate date, String customerName, String itemName, int quantity, int unitPrice) {
		this.date = date;
		this.customerName = customerName;
		this.itemName = itemName;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public Sell() {

	}

	public int getSrNo() {
		return srNo;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	@Override
	public String toString() {
		return "Sell [srNo=" + srNo + ", date=" + date + ", customerName=" + customerName + ", itemName=" + itemName
				+ ", quantity=" + quantity + ", unitPrice=" + unitPrice + ", totalAmount=" + totalAmount + "]";
	}

}