package com.tyss.jpawithibernate.jpql;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ReadDemo {
	public static void main(String[] args) {


		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager	entityManager = entityManagerFactory.createEntityManager();
		//String jpql = "from Product";
		String jpql = "select pname from Product";
		Query query = entityManager.createQuery(jpql);
//		List<Product> productinfos = query.getResultList();
//		for(Product productInfo : productinfos) {
//			System.out.println(productInfo.getPid());
//			System.out.println(productInfo.getPname());
//			System.out.println(productInfo.getQuantity());
//		}
		List<String> sl = query.getResultList();
		for(String Product : sl) {
	System.out.println(Product);
		}
		
		
		entityManager.close();



	}   //end of main method
}       //end of ReadDemo
