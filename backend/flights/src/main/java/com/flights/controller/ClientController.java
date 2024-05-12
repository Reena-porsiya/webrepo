package com.flights.controller;

import com.flights.entity.ClientEntity;
import com.flights.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public ResponseEntity<ClientEntity> addClient(@RequestBody ClientEntity clientEntity) {
        ClientEntity savedClient = clientService.addClient(clientEntity);
        return new ResponseEntity<>(savedClient, HttpStatus.CREATED);
    }
}
