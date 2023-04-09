package com.app.pojo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Table(name = "investment")
@Entity
public class Investment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int srNo;
	@Column(length = 20)
	private LocalDate date;
	@Column(length = 20)
	private String item;
	private int quantity;
	private int unitPrice;
	@JsonIgnore
	private int totalAmount;

	public Investment() {

	}

	public Investment(LocalDate date, String item, int quantity, int unitPrice) {
		this.date = date;
		this.item = item;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.totalAmount = quantity * unitPrice;
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

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
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
		return "Investment [srNo=" + srNo + ", date=" + date + ", item=" + item + ", quantity=" + quantity
				+ ", unitPrice=" + unitPrice + ", totalAmount=" + totalAmount + "]";
	}
}