package com.mycompany.mycompany.service;
import com.mycompany.mycompany.entity.User;

import java.util.List;
import java.util.Optional;


public interface UserService {
    List<User> fetchAll();
    Optional<User> fetchUserById(Integer id);
    Optional<User> fetchUserBySsn(String ssn);
}
