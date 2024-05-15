package com.flights.Repository;

import com.flights.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    @Query("SELECT u FROM UserEntity u WHERE u.username = :username AND u.password = :password")
    UserEntity findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
