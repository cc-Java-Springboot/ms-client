package com.ccamilofierro.ms_client.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ccamilofierro.ms_client.Entity.Client;
import com.ccamilofierro.ms_client.Service.ClientService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/findAll")
    public Flux<Client> findAll() {
        return clientService.findAll();
    }
    
    @GetMapping("/findById/{id}")
    public Mono<Client> findById(@PathVariable Long id) {
        return clientService.findById(id);
    }

    @PostMapping("/createClient")
    public Mono<Client> createClient(@RequestBody Client client) {
        return clientService.createCliente(client);
    }
}
