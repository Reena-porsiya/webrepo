package com.flights.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flights.business.ClientBusiness;
import com.flights.entity.ClientEntity;
import com.flights.service.ClientService;

@Service
public class ClientBusinessImpl implements ClientBusiness {

    @Autowired
    private ClientService clientService;

    @Override
public String createClient(ClientEntity client) {
        
        String msg= clientService.createClient(client);
        return msg;
    }
}
