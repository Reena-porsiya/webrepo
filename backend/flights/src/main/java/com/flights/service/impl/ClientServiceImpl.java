package com.flights.service.impl;

import com.flights.Repository.ClientRepository;
import com.flights.entity.ClientEntity;
import com.flights.service.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public ClientEntity addClient(ClientEntity clientEntity) {
        // You may add additional logic here if needed
        return clientRepository.save(clientEntity);
    }
}
