package com.flights.business;

import com.flights.entity.ClientEntity;
import com.flights.model.Client;


public interface ClientBusiness {
	public String createClient(ClientEntity client);

	public Client getClientById(Long clientId);

	Client getClientById(long clientId);
	

	
}
