package com.flights.business;

import com.flights.entity.ClientEntity;


public interface ClientBusiness {
	public String createClient(ClientEntity client);

	boolean isClientValid(ClientEntity clientEntity);

}

