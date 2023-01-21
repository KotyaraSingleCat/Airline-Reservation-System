package com.airline.reservation.system.converter.impl;

import com.airline.reservation.system.converter.AbstractConverter;
import com.airline.reservation.system.dto.AccountDTO;
import com.airline.reservation.system.persistence.entity.Account;

import java.sql.Timestamp;

public class AccountConverter implements AbstractConverter<Account, AccountDTO> {
    @Override
    public Account convertDtoToEntity(AccountDTO dto) {
        Account account = new Account();
        account.setId(dto.getId());
        account.setEmail(dto.getEmail());
        account.setPassword(dto.getPassword());
        account.setCreated_on(Timestamp.valueOf(dto.getCreated_on()));
        account.setLast_login(Timestamp.valueOf(dto.getCreated_on()));
        return account;
    }

    @Override
    public AccountDTO convertEntityToDto(Account entity) {
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setId(entity.getId());
        accountDTO.setEmail(entity.getEmail());
        accountDTO.setPassword(entity.getPassword());
        accountDTO.setCreated_on(entity.getCreated_on().toLocalDateTime());
        accountDTO.setLast_login(entity.getLast_login().toLocalDateTime());
        return accountDTO;
    }
}
