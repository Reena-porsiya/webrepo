package com.flights.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flights.business.ClientBusiness;
import com.flights.entity.ClientEntity;
import com.flights.model.Client;
import com.flights.service.ClientService;
@Service
public class ClientBusinessImpl implements ClientBusiness {

    @Autowired
    private ClientService clientService;


    @Override
    public Client getClientById(long clientId) {
    	return clientService.getClientById(clientId);
}


	@Override
	public String createClient(ClientEntity client) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Client getClientById(Long clientId) {
		// TODO Auto-generated method stub
		return null;
	}


	
}