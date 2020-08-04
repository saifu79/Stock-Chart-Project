package com.saifullah.userservice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "UserDetails")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "User_Id")
    private Long userId;
    
    @Column(name = "User_Name")
	private String userName;
    
    @Column(name = "User_Password")
	private String password;
    
    @Column(name = "User_Type")
	private String userType;
    
    @Column(name = "User_Email")
	private String email;
    
    @Column(name = "Confirmed_Status")
	private Boolean confirmed;
}
