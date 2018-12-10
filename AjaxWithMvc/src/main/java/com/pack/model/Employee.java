package com.pack.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emloyee_tab")

public class Employee 
{
@Id
private int empId;

private int salary;
private String emp_name;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getEmp_name() {
	return emp_name;
}
public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", salary=" + salary + ", emp_name=" + emp_name + "]";
}


}
