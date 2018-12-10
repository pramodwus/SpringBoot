package com.sathya.ems.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sathya.ems.entity.Employee;
import com.sathya.ems.repository.EmployeeReposistory;

public interface IEmployeeService {
	public boolean removeEmloyee(int empno);
	public boolean updateEmployee(Employee e);
	
	List<Employee> readEmployee();
	boolean insertEmployee(Employee e);
	 
	

	}
