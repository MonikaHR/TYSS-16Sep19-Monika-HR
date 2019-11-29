package com.testyantra.empwebapp.dao;

import com.testyantra.empwebapp.dto.EmployeeInfo;

public interface EmployeeDao {

	public EmployeeInfo auth(int id, String password);

	public EmployeeInfo search(int id);

	public boolean changePassword(int id, String password);

	public boolean registerEmployee(EmployeeInfo info);

}  //end of EmployeeDao
