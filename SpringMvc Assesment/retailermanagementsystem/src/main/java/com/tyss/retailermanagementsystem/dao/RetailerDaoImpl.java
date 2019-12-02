package com.tyss.retailermanagementsystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tyss.retailermanagementsystem.dto.ProductBean;
import com.tyss.retailermanagementsystem.dto.RetailerBean;

@Repository
public class RetailerDaoImpl implements RetailerDAO{

	@PersistenceUnit
	private EntityManagerFactory factory ; //Persistence.createEntityManagerFactory("retailer-unit");
	@Override
	public RetailerBean login(int id, String password) {
		String jpql = "from RetailerBean where id=:id and password=:pass";
		EntityManager manager = factory.createEntityManager();
		//if we use the querry interface here we have to pass jpql only
		TypedQuery<RetailerBean> query = manager.createQuery(jpql,RetailerBean.class);
		query.setParameter("id", id);
		query.setParameter("pass", password);
		try {
			//querry - we have to downcast here  [(EmployeeBean)query=getSingleResult()]
		RetailerBean bean = query.getSingleResult();
		return bean;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
			}
	}
	@Override
	public int createProfile(RetailerBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return bean.getId();
		} catch (Exception e) {
			// TODO: handle exception
			return -1;
		}
		}
	@Override
	public ProductBean searchProduct(int id) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(ProductBean.class, id);
		}
	@Override
	public boolean updatePassword(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		RetailerBean bean = manager.find(RetailerBean.class, id);
		bean.setPassword(password);
		transaction.commit();
		
		return false;
	}
	
}
