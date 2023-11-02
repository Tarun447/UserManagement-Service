package com.cap.service;

import java.util.List;

import com.cap.dto.UserDTO;
import com.cap.model.User;

public interface UserService {
	
	public UserDTO save(UserDTO user) throws Exception;
	
	public List<User> finAllUsers() throws Exception;
	
	public UserDTO getByuserId(int id) throws Exception;
	
	public UserDTO updateUser(int id, UserDTO dto) throws Exception;
	
	public String deleteUser(int id)throws Exception;

}
