package com.tyss.stockmanagement.service;


import java.util.List;

import com.tyss.stockmanagement.dto.OrderHistoryInfoBean;
import com.tyss.stockmanagement.dto.OrderInfoBean;
import com.tyss.stockmanagement.dto.ProductsBean;

public interface StockService {

	public ProductsBean add(ProductsBean bean);

	public boolean modify(ProductsBean bean);

	public ProductsBean searchByName(String name);

	public List<ProductsBean> searchBycategory(String category);

	public List<ProductsBean> searchByCompany(String company);
	
	public List<ProductsBean> getAllProducts();
	
	public boolean reduceQuantity(ProductsBean prod,int quantity);
	
	public boolean generateBill(ProductsBean prod, int quantity);
	
	public OrderInfoBean showBill(int id);
	
	public List<OrderHistoryInfoBean> showHistory();


}
