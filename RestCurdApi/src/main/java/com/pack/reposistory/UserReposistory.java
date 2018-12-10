package com.pack.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pack.entity.UserData;



@Repository
public interface UserReposistory extends JpaRepository<UserData, Integer> 
{
	
 }
