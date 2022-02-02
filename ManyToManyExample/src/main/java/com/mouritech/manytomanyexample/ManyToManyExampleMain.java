package com.mouritech.manytomanyexample;

import java.time.LocalDate;

import com.mouritech.manytomanyexample.dao.EmployeeDao;
import com.mouritech.manytomanyexample.entity.Employee;
import com.mouritech.manytomanyexample.entity.Project;

public class ManyToManyExampleMain {

	public static void main(String[] args) {
		// create employee
		Employee emp = new Employee();
		emp.setEmpFirstName("Rubbu");
		emp.setEmpLastName("Polipilli");
		emp.setEmpEmail("rubbu@gmail.com");
		emp.setEmpDOB(LocalDate.of(1996, 05, 02));
		
		//create project
		Project proj= new Project();
		proj.setProjectName("Online Food Ordering Application");
		
		//create project
		Project proj1= new Project();
		proj1.setProjectName("Online Admission System");
		
		//allocation of projects for employee
		emp.getProjects().add(proj);
		emp.getProjects().add(proj1);
		
		//adding employee reference in the projects
		proj.getEmployees().add(emp);
		proj1.getEmployees().add(emp);
		
		EmployeeDao edao = new EmployeeDao();
		edao.saveEmployee(emp);

	}

}