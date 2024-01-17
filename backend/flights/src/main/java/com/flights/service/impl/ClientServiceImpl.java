package com.flights.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flights.Repository.ClientRepository;
import com.flights.entity.ClientEntity;

import com.flights.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public String createClient(ClientEntity client) {
        
        clientRepository.save(client);
        return "client created successfully";
    }

	
}

