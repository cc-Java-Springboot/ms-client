package com.ccamilofierro.ms_client.Repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.ccamilofierro.ms_client.Entity.Client;

public interface ClientRepository extends ReactiveMongoRepository<Client, Long> {

}
