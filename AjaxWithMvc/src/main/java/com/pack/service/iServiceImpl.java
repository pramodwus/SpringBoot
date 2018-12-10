package com.pack.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.model.Employee;
import com.pack.repository.Reposistory;
@Service
public class iServiceImpl implements IServiceDao {
    @Autowired
    private Reposistory repo;
    
    
	@Override
	public boolean saveEmployeeData(Employee e) 
	{
		try
		{
      repo.saveAndFlush(e);
		
	}
		catch(Exception g)
		{
			return false;
		}
		return true;
	}

	@Override
	public Optional<Employee> getDataById(int id) {
	   
		Optional<Employee> op=repo.findById(id);
		return op;
	   
	}

}
