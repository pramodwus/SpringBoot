package com.pack.service;

import java.util.Optional;

import com.pack.model.Employee;

public interface IServiceDao {
	
	boolean   saveEmployeeData(Employee e);
	Optional<Employee> getDataById(int id);

}
