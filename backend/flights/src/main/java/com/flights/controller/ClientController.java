package com.flights.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flights.business.ClientBusiness;
import com.flights.entity.ClientEntity;
import com.flights.entity.CountryEntity;
import com.flights.model.Client;
import com.flights.service.ClientService;

@RestController
@RequestMapping("/clients")
@CrossOrigin(origins="*")
public class ClientController {

	     @Autowired
	     private ClientService clientService;

	     @GetMapping("/{clientId}")
	     public ResponseEntity<Client> getClientById(@PathVariable Long clientId) {
	         Client client = clientService.getClientById(clientId);
	         if (client != null) {
	             return new ResponseEntity<>(client, HttpStatus.OK);
	         } else {
	             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	         }
	     }

	     // Other client-related endpoints such as client creation, update, delete, etc.
	 }
 

	    
	

