package com.quincaillerie.labor.service;

import com.quincaillerie.labor.dao.entities.Deposit;
import com.quincaillerie.labor.dto.DepositDTO;

import java.util.List;

public interface IDepositService {
    void addDeposit(DepositDTO Deposit);

    void updateDeposit(Deposit Deposit);

    void deleteDeposit(Long id);

    List<Deposit> getAll();
}
