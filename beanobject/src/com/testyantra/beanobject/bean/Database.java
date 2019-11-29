package com.testyantra.beanobject.bean;

public class Database {
    void recieve(Student s) {
    	System.out.println("Id is "+s.getId());
    	System.out.println("Name is "+s.getName());
    	System.out.println("Rollno is "+s.getRollno());
    	System.out.println("******************************");
    }
    void save(Employee e) {
    	System.out.println("Employee id is "+e.getId());
    	System.out.println("Employee salary is "+e.getSalary());
    	System.out.println("employee name is "+e.getName());
    	System.out.println(" employee dept is "+e.getDept());
    	System.out.println("employee designation is "+e.getDesignation());
    }
}
