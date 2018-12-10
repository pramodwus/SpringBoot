package com.sathya.ems.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_tab")

public class Employee {
	@Id
	private int emno;
	@Column(length=15)
	private String ename;
	private int salary;
	private int deptno;
	public int getEmno() {
		return emno;
	}
	public void setEmno(int emono) {
		this.emno = emono;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public Employee(int emono, String ename, int salary, int deptno) {
		super();
		this.emno = emno;
		this.ename = ename;
		this.salary = salary;
		this.deptno = deptno;
	}
	public Employee() {
		
	}
	@Override
	public String toString() {
		return "Employee [emono=" + emno + ", ename=" + ename + ", salary=" + salary + ", deptno=" + deptno
				+ ", getEmono()=" + getEmno() + ", getEname()=" + getEname() + ", getSalary()=" + getSalary()
				+ ", getDeptno()=" + getDeptno() + "]";
	}
	
	
	
	
	
	
	

}
