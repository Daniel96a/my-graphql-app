package com.mycompany.mycompany.mapper;

import com.mycompany.mycompany.entity.User;
import com.mycompany.mycompany.dto.UserDTO;

import java.util.List;
import java.util.Optional;

public class UserMapper {
    public static List<UserDTO> map(List<User> users) {
        return users.stream().map(user -> UserDTO.builder().id(user.getId()).firstname(user.getFirstname()).lastname(user.getLastname()).ssn(user.getSsn()).build()).toList();

    }
    public static UserDTO map(Optional<User> user) {
        return  UserDTO.builder().id(user.get().getId()).firstname(user.get().getFirstname()).lastname(user.get().getLastname()).ssn(user.get().getSsn()).build();
    }
}