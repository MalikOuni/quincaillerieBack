package com.quincaillerie.labor.service;

import com.quincaillerie.labor.dao.entities.Client;
import com.quincaillerie.labor.dto.ClientDTO;

import java.util.List;

public interface IClientService {
    void addClient(ClientDTO Client);

    void updateClient(Client Client);

    void deleteClient(Long id);

    List<Client> getAll();
}
