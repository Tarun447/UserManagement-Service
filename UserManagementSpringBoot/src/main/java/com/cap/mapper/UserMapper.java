package com.cap.mapper;

import com.cap.dto.UserDTO;
import com.cap.model.User;

public class UserMapper {
	
	public static User userMapper(UserDTO dto)
	{
		User user = new User();
//		user.setId(dto.getId());
		user.setFirstName(dto.getFirstName());
		user.setLastName(dto.getLastName());
		user.setEmail(dto.getEmail());		
		return user;
	}
	
	public static UserDTO userDTOMapper(User user)
	{
		UserDTO dto = new UserDTO();
		dto.setId(user.getId());
		dto.setFirstName(user.getFirstName());
		dto.setLastName(user.getLastName());
		dto.setEmail(user.getEmail());		
		return dto;
	}
	

}
