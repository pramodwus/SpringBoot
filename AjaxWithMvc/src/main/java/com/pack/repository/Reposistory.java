package com.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pack.model.Employee;

@Repository

public interface Reposistory extends JpaRepository<Employee,Integer> 
{

	
}
