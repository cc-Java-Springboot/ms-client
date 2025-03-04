package com.ccamilofierro.ms_client.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.ccamilofierro.ms_client.Entity.Client;
import com.ccamilofierro.ms_client.Repository.ClientRepository;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Flux<Client> findAll() {
        return clientRepository.findAll();
    }

    public Mono<Client> findById(Long id) {
        return clientRepository.findById(id);
    }

    public Mono<Client> createCliente(Client client) {
        return clientRepository.insert(client);
    }

    
}

