package com.tyss.jpawithibernateappp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithibernate.onetoone.Person;
import com.tyss.jpawithibernate.onetoone.VoterCard;

public class TestOnetoOne {
	public static void main(String[] args) {

		VoterCard vc = new VoterCard();
		vc.setVid(10);;
		vc.setVname("Ram");
		Person p = new Person();
		p.setPid(100);
		p.setPname("Ram");
		p.setVotercard(vc);


		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			VoterCard vcard = entityManager.find(VoterCard.class, 10);
			System.out.println(vcard.getPerson().getPid());
			//entityManager.persist(p);
			System.out.println("Record saved");
			entityTransaction.commit();

		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}  //end of main

}   // end of TestOnetoOne
