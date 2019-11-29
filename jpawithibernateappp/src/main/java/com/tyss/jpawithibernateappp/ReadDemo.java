package com.tyss.jpawithibernateappp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tyss.jpawithibernate.dto.Product;

public class ReadDemo {
	public static void main(String[] args) {


		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	    Product productdetail = entityManager.find(Product.class, 101);
	   System.out.println("ID----"+productdetail.getPid());
	   System.out.println("Name------"+productdetail.getPname());
	   System.out.println("Quantity------"+productdetail.getQuantity());
	}  //end of main

}     //end of class
