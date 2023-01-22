package com.airline.reservation.system.service.impl;

import com.airline.reservation.system.converter.AbstractConverter;
import com.airline.reservation.system.converter.impl.AccountConverter;
import com.airline.reservation.system.dto.AccountDTO;
import com.airline.reservation.system.persistence.entity.Account;
import com.airline.reservation.system.persistence.repository.AccountRepository;
import com.airline.reservation.system.service.interfaces.AbstractAccountService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AccountService implements AbstractAccountService {

    private final AccountRepository repository;
    private final AbstractConverter<Account, AccountDTO> accountConverter;

    @Autowired
    public AccountService(AccountRepository repository) {
        accountConverter = new AccountConverter();
        this.repository = repository;
    }

    @Override
    public Optional<Account> findByID(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Account> findAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Account create(AccountDTO dto) {
        return repository.save(accountConverter.convertDtoToEntity(dto));
    }
}
