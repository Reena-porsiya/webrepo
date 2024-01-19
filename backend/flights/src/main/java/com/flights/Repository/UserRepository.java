package com.flights.Repository;
import org.springframework.stereotype.Repository;

import com.flights.entity.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UserEntity> {
    Optional<UserEntity> findByUsernameAndPassword(String username, String password);
}
