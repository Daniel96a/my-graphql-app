package com.mycompany.mycompany.controller.rest;

import com.mycompany.mycompany.dto.UserDTO;
import com.mycompany.mycompany.entity.User;
import com.mycompany.mycompany.mapper.UserMapper;
import com.mycompany.mycompany.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/")
    public List<UserDTO> getAllUsers(){
        List<User> users = userService.fetchAll();
        return  UserMapper.map(users);
    }

}
