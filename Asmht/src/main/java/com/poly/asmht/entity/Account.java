package com.poly.asmht.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "Accounts")
public class Account {
    @Id
    private String username;
    private String password;
    private String fullname;
    private String email;
    private String photo;
//    private Boolean active;
    private Boolean admin;

    private State state;

    private String verificationCode;
    @OneToMany(mappedBy = "account")
    List<Order> orders;
}