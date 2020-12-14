package com.adreas.services;

import com.adreas.dto.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adreas.repositories.ClientRepository;

@Service("clientService")
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    public Client saveClient(Client client){

        Client client1Saved =  clientRepository.save(client);

        return client1Saved;
    }


}

