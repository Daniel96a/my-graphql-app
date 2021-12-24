package com.mycompany.mycompany.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserDTO {
    private Integer id;
    private String ssn;
    private String firstname;
    private String lastname;
}
