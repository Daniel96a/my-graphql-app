package com.mycompany.mycompany.controller.graphql;

import com.mycompany.mycompany.dto.UserDTO;
import com.mycompany.mycompany.entity.User;
import com.mycompany.mycompany.mapper.UserMapper;
import com.mycompany.mycompany.service.UserService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class UserGraphQLController {
    private final UserService userService;

    public UserGraphQLController(UserService userService) {
        this.userService = userService;
    }

    @QueryMapping
    List<UserDTO> users (){
        List<User> users = userService.fetchAll();
        return UserMapper.map(users);
    }

    @QueryMapping
    UserDTO userById(@Argument Integer id){
        Optional<User> user = userService.fetchUserById(id);
        return UserMapper.map(user);
    }

    @QueryMapping
    UserDTO userBySsn(@Argument String ssn){
        Optional<User> user = userService.fetchUserBySsn(ssn);
        return UserMapper.map(user);
    }

}
