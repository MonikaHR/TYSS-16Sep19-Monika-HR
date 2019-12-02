package com.tyss.retailermanagementsystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductBean {
	@Id
	@Column
private int pid;
	@Column
private String pname;
	@Column
private int priceperUnit;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPriceperUnit() {
		return priceperUnit;
	}
	public void setPriceperUnit(int priceperUnit) {
		this.priceperUnit = priceperUnit;
	}

	
}
