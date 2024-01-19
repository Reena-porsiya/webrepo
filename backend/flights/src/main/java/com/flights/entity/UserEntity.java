package com.flights.entity;


import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

    // Constructors, getters, setters

    // Omitted other details for brevity

    // Getters and setters

    // Constructors

    // equals, hashCode, and other methods

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// Nested class for composite primary key
    public static class UserEntityId implements Serializable {
        private Long id;
        private String username;

        // Constructors, equals, and hashCode methods

        // Getters and setters for id and username

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        // equals, hashCode, and other methods
    }
}
