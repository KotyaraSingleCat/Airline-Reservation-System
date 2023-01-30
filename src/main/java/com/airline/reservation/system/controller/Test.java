package com.airline.reservation.system.controller;

import com.airline.reservation.system.controller.AbstractController;
import com.airline.reservation.system.dto.AccountDTO;
import com.airline.reservation.system.persistence.entity.Account;
import com.airline.reservation.system.service.impl.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/account2")
public class Test implements AbstractController<Account, AccountDTO> {

    @Autowired
    AccountService accountController;

    @Override
    public Optional<Account> findByID(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Account> findAll() {
        return accountController.findAll();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Account create(AccountDTO dto) {
        return null;
    }
}
