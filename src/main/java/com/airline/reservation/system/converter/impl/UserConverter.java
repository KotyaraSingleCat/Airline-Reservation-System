package com.airline.reservation.system.converter.impl;

import com.airline.reservation.system.converter.AbstractConverter;
import com.airline.reservation.system.dto.AccountDTO;
import com.airline.reservation.system.dto.UserDTO;
import com.airline.reservation.system.persistence.entity.Account;
import com.airline.reservation.system.persistence.entity.User;

import java.sql.Date;

public class UserConverter implements AbstractConverter<User, UserDTO> {
    private final AbstractConverter<Account, AccountDTO> accountConverter;

    public UserConverter() {
        accountConverter = new AccountConverter();
    }

    @Override
    public User convertDtoToEntity(UserDTO dto) {
        User user = new User();
        user.setId(dto.getId());
        user.setName(dto.getName());
        user.setSurname(dto.getSurname());
        user.setLastname(dto.getLastname());
        user.setDate_of_birth(Date.valueOf(dto.getDate_of_birth()));
        user.setCard(dto.getCard());
        user.setAccount(accountConverter.convertDtoToEntity(dto.getAccountDTO()));
        return user;
    }

    @Override
    public UserDTO convertEntityToDto(User entity) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(entity.getId());
        userDTO.setName(entity.getName());
        userDTO.setSurname(entity.getSurname());
        userDTO.setLastname(entity.getLastname());
        userDTO.setCard(entity.getCard());
        userDTO.setAccountDTO(accountConverter.convertEntityToDto(entity.getAccount()));
        return userDTO;
    }
}
