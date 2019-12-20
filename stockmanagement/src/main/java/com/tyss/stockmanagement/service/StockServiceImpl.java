package com.tyss.stockmanagement.service;


import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.stockmanagement.dao.StockDAO;
import com.tyss.stockmanagement.dto.OrderHistoryInfoBean;
import com.tyss.stockmanagement.dto.OrderInfoBean;
import com.tyss.stockmanagement.dto.ProductsBean;

@Service
public class StockServiceImpl implements StockService{
	
	@Autowired
	private StockDAO dao;
	
	@Autowired
	private EntityManagerFactory factory;

	@Override
	public ProductsBean add(ProductsBean bean) {
		return dao.add(bean);
	}

	@Override
	public boolean modify(ProductsBean bean) {
		return dao.modify(bean);
	}

	@Override
	public ProductsBean searchByName(String name) {
		return dao.searchByName(name);
	}

	@Override
	public List<ProductsBean> searchBycategory(String category) {
		return dao.searchBycategory(category);
	}

	@Override
	public List<ProductsBean> searchByCompany(String company) {
		return dao.searchByCompany(company);
	}

	@Override
	public List<ProductsBean> getAllProducts() {
		return dao.getAllProducts();
	}

	@Override
	public boolean reduceQuantity(ProductsBean prod, int quantity) {
		return dao.reduceQuantity(prod, quantity);
	}

	@Override
	public boolean generateBill(ProductsBean prod, int quantity) {
		OrderInfoBean order = new OrderInfoBean();
		ProductsBean prod1 = factory.createEntityManager().find(ProductsBean.class, prod.getId());
		boolean isSuccess = reduceQuantity(prod1, quantity);
		if(isSuccess) {
		double totalPrice = quantity*prod1.getPrice();
		double totalPrice_with_gst = (totalPrice*0.08)+totalPrice;
		order.setTotalPrice(totalPrice);
		order.setTotalPriceGst(totalPrice_with_gst);
		
		
		return dao.generateBill(order,prod.getId());
		}
		else
		{
			return false;
		}
	}

	@Override
	public OrderInfoBean showBill(int id) {
		return dao.showBill(id);
	}

	@Override
	public List<OrderHistoryInfoBean> showHistory() {
		return dao.showHistory();
	}

	
}
