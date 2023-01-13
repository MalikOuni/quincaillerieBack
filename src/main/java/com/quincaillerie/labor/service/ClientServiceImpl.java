package com.quincaillerie.labor.service;

import com.quincaillerie.labor.dao.entities.Client;
import com.quincaillerie.labor.dao.repositories.IClientRepository;
import com.quincaillerie.labor.dto.ClientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.quincaillerie.labor.dto.ClientDTO.fromDtoToEntity;

@Service
public class ClientServiceImpl implements IClientService{
    @Autowired
    private IClientRepository repository;

    @Override
    public void addClient(ClientDTO Client) {
        repository.save(fromDtoToEntity(Client));
    }

    @Override
    public void updateClient(Client Client) {
        if(Client != null && Client.getId() != null){
            Optional<Client> ClientFromDb = repository.findById(Client.getId());
            if(ClientFromDb.isPresent()){
                repository.save(Client);
            }
        }
    }

    @Override
    public void deleteClient(Long id) {
        if (id != null){
            repository.deleteById(id);
        }

    }

    @Override
    public List<Client> getAll() {
        return repository.findAll();
    }
}
