package com.quincaillerie.labor.web.rest;


import com.quincaillerie.labor.dao.entities.Deposit;
import com.quincaillerie.labor.dto.DepositDTO;
import com.quincaillerie.labor.service.IDepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/deposit")
public class DepositRestController {
    @Autowired
    private IDepositService service;

    @PostMapping("/add")
    public void createDeposit(@RequestBody DepositDTO Deposit){
        service.addDeposit(Deposit);
    }

    @PutMapping("/update")
    public void updateDeposit(@RequestBody Deposit Deposit){
        service.updateDeposit(Deposit);
    }

    @DeleteMapping("/delete/{idDeposit}")
    public void deleteDeposit(@PathVariable("idDeposit") Long id) {
        service.deleteDeposit(id);
    }
    @GetMapping("/all")
    public List<Deposit> getAll (){
        return service.getAll();
    }
    
}
