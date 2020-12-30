package com.adreas.services;

import com.adreas.dto.Client;

import java.util.List;
import java.util.Optional;


public interface ClientService {

    public  Client saveClient(Client client);

    public List<Client> findClients();

    public Optional<Client> findById(Integer id);

    public void deleteClientById(Integer id);
}
