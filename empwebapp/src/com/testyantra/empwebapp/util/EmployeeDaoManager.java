package com.testyantra.empwebapp.util;

import com.testyantra.empwebapp.dao.EmployeeDao;
import com.testyantra.empwebapp.dao.EmployeeDaoJdbcImpl;

public class EmployeeDaoManager {

	private EmployeeDaoManager() {}

	public static EmployeeDao getEmployeeDao() {
		return new EmployeeDaoJdbcImpl();
	}
}
