package com.adreas.services;

import com.adreas.dto.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adreas.repositories.ClientRepository;

import java.util.List;
import java.util.Optional;

@Service("clientService")
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    public Client saveClient(Client client){

        Client client1Saved =  clientRepository.save(client);

        return client1Saved;
    }

    public List<Client> findClients(){

        List getClients = (List) clientRepository.findAll();

        return getClients;
    }

    public Optional<Client> findById(Integer id){

        Optional<Client> getTheClient = clientRepository.findById(id);

        return getTheClient;


    }
    public void deleteClientById(Integer id){

        clientRepository.deleteById(id);
    }

}

