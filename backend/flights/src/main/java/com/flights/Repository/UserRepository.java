package com.flights.Repository;
import org.springframework.stereotype.Repository;

import com.flights.entity.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;



@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{
	
	
}