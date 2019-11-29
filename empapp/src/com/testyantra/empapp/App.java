package com.testyantra.empapp;


import java.util.List;
import java.util.Scanner;

import com.testyantra.empapp.dao.EmployeeDAO;
import com.testyantra.empapp.dao.EmployeeDAOImpl;
import com.testyantra.empapp.dto.EmployeeBean;
import com.testyantra.empapp.util.EmployeeManager;

public class App {
	public static void main(String[] args) {
		System.out.println("press 1 to get all employee data");
		System.out.println("press 2 to insert employee data");
		System.out.println("press 3 to update employee data");
		System.out.println("press 4 to delete employee data");
		System.out.println("press 5 to search single employee data");

		Scanner scn = new Scanner(System.in);
		int ch = scn.nextInt();

		switch (ch) {
		case 1: EmployeeDAO dao = EmployeeManager.getEmployeeDAO();
		List<EmployeeBean> result =  dao.getAllEmployeeData();

		for(EmployeeBean bean : result) {
			System.out.println("Id: "+bean.getId());
			System.out.println("Name: "+bean.getName());
			System.out.println("Gender: "+bean.getGender());
			System.out.println("Salary: "+bean.getSal());
		}
		break;

		case 2 : EmployeeDAO dao2 = EmployeeManager.getEmployeeDAO();
		EmployeeBean bean2 = new EmployeeBean();
		int count2 = dao2.insertEmployeeData(bean2);
		System.out.println(count2+" Row(s) Inserted");
		break;
			

		case 3 :  EmployeeDAO dao3 = EmployeeManager.getEmployeeDAO();
		EmployeeBean bean3 = new EmployeeBean();
		int count3 = dao3.updateEmployeeData(bean3);
		System.out.println(count3+" Row(s) Updated");
		break;
		
			

		case 4 :  EmployeeDAO dao4 = EmployeeManager.getEmployeeDAO();
		System.out.println("Enter Id");
		int id4 = scn.nextInt();
		int count4 = dao4.deleteEmployeeData(id4);
		System.out.println(count4+" Row(s) Deleted");
			break;

		case 5 :   EmployeeDAO dao5 = EmployeeManager.getEmployeeDAO();
		int id = scn.nextInt();
		EmployeeBean bean = dao5.searchEmployeeData(id);
		if (bean != null){
			System.out.println("Id: "+bean.getId());
			System.out.println("Name: "+bean.getName());
			System.out.println("Gender: "+bean.getGender());
			System.out.println("Salary: "+bean.getSal());
		}else {
			System.out.println("No Data Found");
		}
		break;

		default:
			break;
		}    //end of switch



	}  //main
}      //App
