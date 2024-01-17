package com.flights.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity {
	
	@Id
    @Column(name = "userid")
	private int user_id;
	
	@Id
    @Column(name = "username")
	private String username;
	

	@Id
    @Column(name = "password")
	private String password;
	
	
	
	 @ManyToOne
	    @JoinColumn(name = "client_id")
	    private ClientEntity client;



	public int getUser_id() {
		return user_id;
	}



	public void setUser_id(int user_id) {
		this.user_id = user_id;
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



	public ClientEntity getClient() {
		return client;
	}



	public void setClient(ClientEntity client) {
		this.client = client;
	}
	 
}
