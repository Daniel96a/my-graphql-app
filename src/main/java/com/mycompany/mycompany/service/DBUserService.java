package com.mycompany.mycompany.service;

import com.mycompany.mycompany.entity.User;
import com.mycompany.mycompany.repository.UserRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DBUserService implements UserService {
    private final UserRepository userRepository;

    public DBUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> fetchAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> fetchUserById(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public Optional<User> fetchUserBySsn(String ssn) {
        return userRepository.findUserBySsn(ssn);
    }
}
