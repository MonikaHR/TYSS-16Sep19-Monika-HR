package com.tyss.retailermanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.retailermanagementsystem.dao.RetailerDAO;
import com.tyss.retailermanagementsystem.dto.ProductBean;
import com.tyss.retailermanagementsystem.dto.RetailerBean;

@Service
public class RetailerServiceImpl implements RetailerService{
@Autowired
 private RetailerDAO dao;

@Override
public RetailerBean login(int id, String password) {
	return dao.login(id, password);
}

@Override
public int createProfile(RetailerBean bean) {
	
	return dao.createProfile(bean);
}

@Override
public ProductBean searchProduct(int id) {
	return dao.searchProduct(id);
}

@Override
public boolean updatePassword(int id, String password) {
	return dao.updatePassword(id, password);
}
	


  
	
}
