package com.tyss.stockmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tyss.stockmanagement.dto.OrderHistoryInfoBean;
import com.tyss.stockmanagement.dto.OrderInfoBean;
import com.tyss.stockmanagement.dto.ProductsBean;

@Repository
public class StockDaoImpl implements StockDAO{

	@PersistenceUnit
	EntityManagerFactory entityManagerFactory = null;

	@Override
	public ProductsBean add(ProductsBean bean) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(bean);
			transaction.commit();
			return bean;
		} catch (Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
		return null;
	}    //end of add

	@Override
	public boolean modify(ProductsBean bean) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		ProductsBean pBean = manager.find(ProductsBean.class, bean.getId());
		pBean.setName(bean.getName());
		pBean.setCompany(bean.getCompany());
		pBean.setCategory(bean.getCategory());
		pBean.setQuantity(bean.getQuantity());
		pBean.setPrice(bean.getPrice());
		transaction.commit();
		return true;
	}   //end of modify

	@Override
	public  ProductsBean searchByName(String name) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		try {
			String jpql = "from ProductsBean where name=:name";
			TypedQuery<ProductsBean> typedQuery = manager.createQuery(jpql,ProductsBean.class);
			typedQuery.setParameter("name", name);
			ProductsBean productsBean = typedQuery.getSingleResult();
			return productsBean;
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<ProductsBean> searchBycategory(String category) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		try {
			String jpql = "from ProductsBean where category=:category";
			TypedQuery<ProductsBean> typedQuery = manager.createQuery(jpql,ProductsBean.class);
			typedQuery.setParameter("category", category);
			return typedQuery.getResultList();
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<ProductsBean> searchByCompany(String company) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		try {
			String jpql = "from ProductsBean where company=:company";
			TypedQuery<ProductsBean> typedQuery = manager.createQuery(jpql,ProductsBean.class);
			typedQuery.setParameter("company", company);
			return typedQuery.getResultList();
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<ProductsBean> getAllProducts() {
		EntityManager manager = entityManagerFactory.createEntityManager();
		try {
			String jpql = "from ProductsBean";
			TypedQuery<ProductsBean> typedQuery = manager.createQuery(jpql,ProductsBean.class);
			return typedQuery.getResultList();
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean reduceQuantity(ProductsBean prod, int quantity) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			ProductsBean prod1 = manager.find(ProductsBean.class, prod.getId());
			if(prod1.getQuantity()>=quantity)
			{
			prod1.setCategory(prod.getCategory());
			prod1.setCompany(prod.getCompany());
			prod1.setId(prod.getId());
			prod1.setName(prod.getName());
			prod1.setPrice(prod.getPrice());
			int maxQuantity=prod.getQuantity();
			prod1.setQuantity(maxQuantity-quantity);
			transaction.commit();
			return true;
			}
			else
			{
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean generateBill(OrderInfoBean order, int productId) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(order);
			transaction.commit();
			OrderInfoBean or = manager.find(OrderInfoBean.class, order.getId());
			int id  = or.getId();
			addHistory(id, productId);
			return true;
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		}
	}


	@Override
	public void addHistory(int orderId, int productId) {
		{
			OrderHistoryInfoBean history = new OrderHistoryInfoBean();
			history.setOrderId(orderId);
			history.setProductId(productId);
			EntityManager manager = entityManagerFactory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			try {
				transaction.begin();
				manager.persist(history);
				transaction.commit();
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
		}
	}


	@Override
	public OrderInfoBean showBill(int id) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		try
		{
			OrderInfoBean order = manager.find(OrderInfoBean.class,id);
			return order;
		}
		catch(Exception e)
		{
			return null;
		}
	}
	@Override
	public List<OrderHistoryInfoBean> showHistory() {
		EntityManager manager = entityManagerFactory.createEntityManager();
		String jpql = "from OrderHistoryInfoBean";
		TypedQuery<OrderHistoryInfoBean> query = manager.createQuery(jpql, OrderHistoryInfoBean.class);
		List<OrderHistoryInfoBean> list = query.getResultList();
		return list;
	}

    

}


