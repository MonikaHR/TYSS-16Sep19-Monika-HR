package com.tyss.jpawithibernateappp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithibernate.dto.Product;

public class InsertDemo {

	public static void main(String[] args) {
		Product product = new Product();
		product.setPid(103);
		product.setPname("Pens");
		product.setQuantity(10);
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(product);
		System.out.println("Record saved");
		entityTransaction.commit();
		
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}        //end of main
}            //end of InsertDemo


