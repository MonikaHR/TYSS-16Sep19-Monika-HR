package com.tyss.retailermanagementsystem.service;

import com.tyss.retailermanagementsystem.dto.ProductBean;
import com.tyss.retailermanagementsystem.dto.RetailerBean;

public interface RetailerService {

	public RetailerBean login(int id,String password);
	public int createProfile(RetailerBean bean);
		
		public ProductBean searchProduct(int id);
		public boolean updatePassword(int id,String password);
}
