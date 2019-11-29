package com.tyss.jpawithibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicDelete {
	public static void main(String[] args) {

		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String jpql = "delete from Product where pid=:id";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("id", 102);
			int result = query.executeUpdate();
			System.out.println(result);
			transaction.commit();

		 } catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();

	}
}