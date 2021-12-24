package com.mycompany.mycompany.entity;

import lombok.Getter;
import lombok.Setter;
import org.intellij.lang.annotations.Identifier;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Identifier
    private String ssn;
    private String firstname;
    private String lastname;

}
