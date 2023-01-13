package com.quincaillerie.labor.service;

import com.quincaillerie.labor.dao.entities.Deposit;
import com.quincaillerie.labor.dao.repositories.IDepositRepository;
import com.quincaillerie.labor.dto.DepositDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.quincaillerie.labor.dto.DepositDTO.fromDtoToEntity;

@Service
public class DepositServiceImpl implements IDepositService {
    @Autowired
    private IDepositRepository repository;

    @Override
    public void addDeposit(DepositDTO Deposit) {
        repository.save(fromDtoToEntity(Deposit));
    }

    @Override
    public void updateDeposit(Deposit Deposit) {
        if(Deposit != null && Deposit.getId() != null){
            Optional<Deposit> DepositFromDb = repository.findById(Deposit.getId());
            if(DepositFromDb.isPresent()){
                repository.save(Deposit);
            }
        }
    }

    @Override
    public void deleteDeposit(Long id) {
        if (id != null){
            repository.deleteById(id);
        }

    }

    @Override
    public List<Deposit> getAll() {
        return repository.findAll();
    }
}
