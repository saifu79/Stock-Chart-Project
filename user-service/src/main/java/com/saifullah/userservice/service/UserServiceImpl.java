package com.saifullah.userservice.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saifullah.userservice.dao.UserRepository;
import com.saifullah.userservice.dto.UserDTO;
import com.saifullah.userservice.entities.UserEntity;

@Service
public class UserServiceImpl implements UserService{
	
    @Autowired
    private UserRepository userRepository;

    //private static final Logger LOGGER = LogDelegateFactory.getLogger(UserServiceImpl.class);
    
    @Override
    public UserDTO addUserDetails(UserDTO userDTO)
    {
        ModelMapper mapper=new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserEntity userEntity = mapper.map(userDTO, UserEntity.class);
        userRepository.save(userEntity);
		return userDTO;
 
    }

    @Override
    public UserDTO getUserDetails(Long userId) {
        //LOGGER.info("Fetching User details for UserId: {}", userId);
        UserEntity userEntity = userRepository.findByUserId(userId);
       
        ModelMapper mapper=new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserDTO userDTO = mapper.map(userEntity, UserDTO.class);
       
        return userDTO;
    }

}
