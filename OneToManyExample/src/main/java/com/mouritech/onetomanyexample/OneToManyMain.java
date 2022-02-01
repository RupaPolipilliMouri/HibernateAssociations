package com.mouritech.onetomanyexample;

import java.time.LocalDate;
import java.util.List;

import com.mouritech.onetomanyexample.dao.DepartmentDao;
import com.mouritech.onetomanyexample.dao.EmployeeDao;
import com.mouritech.onetomanyexample.entity.Department;
import com.mouritech.onetomanyexample.entity.Employee;

public class OneToManyMain {

	public static void main(String[] args) {
		
		EmployeeDao empDao = new EmployeeDao();
		DepartmentDao deptDao = new DepartmentDao();
		
		Employee emp = new Employee("Rupa", "N", "Rupamay1996@gmail.com", 
													LocalDate.of(1996, 05, 02));
		//empDao.saveEmployee(emp);
		
		//create some departments
		Department dept = new Department("GCP");
		emp.getDepartments().add(dept);
		
		Department dept1 = new Department("SAP");
		emp.getDepartments().add(dept1);
		
		empDao.saveEmployee(emp);
		
		System.out.println("Employee By ID  =" +empDao.getEmployee(1L));
		/*
		 * System.out.println("Department For ID  =" ); List<Department> deptList =
		 * empDao.getEmployee(1L).getDepartments(); System.out.println(deptList);
		 */
	}

}