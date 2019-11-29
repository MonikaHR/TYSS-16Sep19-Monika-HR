package com.tyss.jpawithibernateappp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithibernate.manytomany.Course;
import com.tyss.jpawithibernate.manytomany.Student;

public class TestManyToMany {
	public static void main(String[] args) {

		Course course = new Course();
		course.setCid(1);
		course.setCname("Java");
		
		Course course1 = new Course();
		course.setCid(2);
		course.setCname("SQL");
		
		ArrayList<Course> alCourses = new ArrayList<Course>();
		alCourses.add(course);
		alCourses.add(course1);
		
		Student s = new Student();
		s.setSid(102);
		s.setSname("Ram");
		s.setCourse(alCourses);
		


		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(s);
		System.out.println("Record saved");
		entityTransaction.commit();
		
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();

	}  //main
}
