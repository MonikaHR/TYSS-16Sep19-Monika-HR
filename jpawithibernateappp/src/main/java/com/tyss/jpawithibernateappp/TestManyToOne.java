package com.tyss.jpawithibernateappp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithibernate.onetomany.Pencil;
import com.tyss.jpawithibernate.onetomany.PencilBox;

public class TestManyToOne {
	public static void main(String[] args) {
		
		PencilBox pb = new PencilBox();
		pb.setBid(2);
		pb.setBname("Apsara");
		
		Pencil p = new Pencil();
		p.setPid(13);
		p.setColor("Blue");
		p.setPencilBox(pb);
		
		Pencil p1 = new Pencil();
		p1.setPid(14);
		p1.setColor("Black");
		p1.setPencilBox(pb);
	
	
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(p);
		entityManager.persist(p1);
		System.out.println("Record saved");
		entityTransaction.commit();
		
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
		
	}   //main

}    //TestManyToOne
