package com.tyss.stockmanagement.dto;

import java.util.List;

public class Response {

	private int code;
	private String message;
	private String description;
	private List<ProductsBean> beans;
	private ProductsBean bean;

	public ProductsBean getBean() {
		return bean;
	}
	public void setBean(ProductsBean bean) {
		this.bean = bean;
	}
	public List<ProductsBean> getBeans() {
		return beans;
	}
	public void setBeans(List<ProductsBean> beans) {
		this.beans = beans;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
