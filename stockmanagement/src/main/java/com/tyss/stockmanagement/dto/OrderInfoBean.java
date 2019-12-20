package com.tyss.stockmanagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Order_Info")
public class OrderInfoBean {
	
	@Id
	@GeneratedValue
	@Column
	private int id;
	@Column(name = "total_price")
	private double totalPrice;
	@Column(name = "total_price_with_gst")
	private double totalPriceGst;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public double getTotalPriceGst() {
		return totalPriceGst;
	}
	public void setTotalPriceGst(double totalPriceGst) {
		this.totalPriceGst = totalPriceGst;
	}
	
	

}
