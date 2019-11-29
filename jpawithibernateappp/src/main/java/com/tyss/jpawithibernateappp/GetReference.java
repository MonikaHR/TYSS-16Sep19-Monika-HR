package com.tyss.jpawithibernateappp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tyss.jpawithibernate.dto.Product;

public class GetReference {
	public static void main(String[] args) {
		EntityManager entityManager = null;

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
	//	Product productdetail = entityManager.find(Product.class, 102);
	//	System.out.println(productdetail.getClass());
		Product productdetail = entityManager.getReference(Product.class, 102);
//		System.out.println("ID----"+productdetail.getPid());
//		System.out.println("Name------"+productdetail.getPname());
//		System.out.println("Quantity------"+productdetail.getQuantity());

		entityManager.close();
	}
}
