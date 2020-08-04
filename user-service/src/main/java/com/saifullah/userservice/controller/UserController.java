package com.saifullah.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.saifullah.userservice.dto.UserDTO;
import com.saifullah.userservice.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    
    
    @RequestMapping(value = "/userDetails", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public UserDTO addUserDetails(@RequestBody UserDTO userDTO){
        return userService.addUserDetails(userDTO);
    }

    @RequestMapping(value = "/userDetails/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDTO getUserDetails(@PathVariable (name= "userId") Long userId){
    	
    	return userService.getUserDetails(userId);
    }
    
}
