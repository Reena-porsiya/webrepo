package com.flights.service.impl;


import org.springframework.stereotype.Service;

import com.flights.Repository.ClientRepository;

import com.flights.entity.ClientEntity;

import com.flights.model.Client;
import com.flights.model.Country;
import com.flights.service.ClientService;




import org.springframework.beans.factory.annotation.Autowired;
	
@Service
	public class ClientServiceImpl implements ClientService{
		
	@Autowired
	private ClientRepository clientRepository;
	
	@Override
	public Client getClientById(Long clientId) {
		ClientEntity clientEntity = new ClientEntity();
        return mapClientEntityToModel(clientEntity);
	}
	
private Client mapClientEntityToModel(ClientEntity clientEntity) {
	Client client = new Client();
    if (clientEntity != null) {
    	client.setClientId(clientEntity.getClientId());
    	if(clientEntity.getCountry()!=null) {
    		Country country = new Country();
    		country.setIataCountryCode(clientEntity.getCountry(). getIataCountryCode());
    		country.setName(clientEntity.getCountry().getName());
    		
    		client.setCountry(country);
    	}
    	client.setClientId(clientEntity.getClientId());
    	client.setFirstName(clientEntity.getFirstName());
    	client.setMiddleName(clientEntity.getMiddleName());
    	client.setLastName(clientEntity.getLastName());
    	client.setPhone(clientEntity.getPhone());
    	client.setPhone(clientEntity.getPhone());
    	client.setPassport(clientEntity.getPassport());
    	client.setPassport(clientEntity.getPassport());
    	
            }
    return client;
}

}