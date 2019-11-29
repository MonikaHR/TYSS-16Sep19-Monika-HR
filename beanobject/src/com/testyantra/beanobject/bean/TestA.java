package com.testyantra.beanobject.bean;

public class TestA {
 public static void main(String[] args) {
	Student s = new Student();
	s.setId(12);
	s.setName("Shivagami");
	s.setRollno(232);
	
	Database db = new Database();
	db.recieve(s);
	

	
	Employee e = new Employee();
	e.setId(45);
	e.setSalary(24555);
	e.setName("Monu");
	e.setDept(20);
	e.setDesignation("Software Developer");
	db.save(e);
}
}