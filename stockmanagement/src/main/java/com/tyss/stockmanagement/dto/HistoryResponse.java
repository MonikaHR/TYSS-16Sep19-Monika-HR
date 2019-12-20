package com.tyss.stockmanagement.dto;

import java.util.List;

public class HistoryResponse {

	private int statusCode;
	private String description;
	private String message;
	private List<OrderHistoryInfoBean> ordHis;
	public int getStatusCode() {
		return statusCode;
	}
	public List<OrderHistoryInfoBean> getOrdHis() {
		return ordHis;
	}
	public void setOrdHis(List<OrderHistoryInfoBean> ordHis) {
		this.ordHis = ordHis;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
