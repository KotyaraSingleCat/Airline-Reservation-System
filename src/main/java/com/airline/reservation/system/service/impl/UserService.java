package com.airline.reservation.system.service.impl;

import com.airline.reservation.system.converter.AbstractConverter;
import com.airline.reservation.system.converter.impl.UserConverter;
import com.airline.reservation.system.dto.UserDTO;
import com.airline.reservation.system.persistence.entity.User;
import com.airline.reservation.system.persistence.repository.UserRepository;
import com.airline.reservation.system.service.interfaces.AbstractUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements AbstractUserService {

    private final UserRepository repository;
    private final AbstractConverter<User, UserDTO> userConverter;

    @Autowired
    public UserService(UserRepository repository) {
        userConverter = new UserConverter();
        this.repository = repository;
    }

    @Override
    public Optional<User> findByID(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public User create(UserDTO dto) {
        return repository.save(userConverter.convertDtoToEntity(dto));
    }
}
