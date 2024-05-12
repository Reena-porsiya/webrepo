package com.flights.business.impl;

import com.flights.business.ClientBusiness;
import com.flights.entity.ClientEntity;
import org.springframework.stereotype.Component;

@Component
public class ClientBusinessImpl implements ClientBusiness {

    @Override
    public boolean isClientValid(ClientEntity clientEntity) {
        // Here you can implement any business logic for client validation
        // For example, you can check if the client's email is valid or if the phone number is in the correct format
        // For simplicity, let's assume all clients are valid
        return true;
    }

	@Override
	public String createClient(ClientEntity client) {
		// TODO Auto-generated method stub
		return null;
	}
}
