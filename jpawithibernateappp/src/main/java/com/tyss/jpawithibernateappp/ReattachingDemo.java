
package com.tyss.jpawithibernateappp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithibernate.dto.Product;

public class ReattachingDemo {
	public static void main(String[] args) {

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Product product = entityManager.find(Product.class, 102);
			//			boolean isObjectPresent =	entityManager.contains(product);
			//			System.out.println("Object Present "+isObjectPresent);
			
			System.out.println(entityManager.contains(product));
			entityManager.detach(product);
			System.out.println(entityManager.contains(product));
			
			
			Product product1 =	entityManager.merge(product);
			product1.setPname("EarPhones");  //cant able to update after detache
			System.out.println("Record Updated");
			entityTransaction.commit();


		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();


	}    //end of main

}
