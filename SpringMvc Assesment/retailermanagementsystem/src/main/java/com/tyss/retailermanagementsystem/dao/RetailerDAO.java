package com.tyss.retailermanagementsystem.dao;

import com.tyss.retailermanagementsystem.dto.ProductBean;
import com.tyss.retailermanagementsystem.dto.RetailerBean;

public interface RetailerDAO {
	public RetailerBean login(int id,String password);
	public int createProfile(RetailerBean bean);
	
   public ProductBean searchProduct(int id);
	public boolean updatePassword(int id,String password);
	

}
