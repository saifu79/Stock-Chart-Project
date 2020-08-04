package com.saifullah.userservice.service;

import com.saifullah.userservice.dto.UserDTO;

public interface UserService {
	
	public UserDTO addUserDetails(UserDTO userDTO);
	public UserDTO getUserDetails(Long userId);

}
