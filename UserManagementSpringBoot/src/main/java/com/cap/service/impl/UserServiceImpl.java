package com.cap.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dto.UserDTO;
import com.cap.mapper.UserMapper;
import com.cap.model.User;
import com.cap.repository.UserRepository;
import com.cap.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repo;

	@Override
	public UserDTO save(UserDTO dto) throws Exception {
		User user = UserMapper.userMapper(dto);
	  user = repo.save(user);
	  return UserMapper.userDTOMapper(user);
	}

	@Override
	public List<User> finAllUsers() {
		return repo.findAll();
	}

	@Override
	public UserDTO getByuserId(int id) throws Exception {
		User user = repo.findById(id).get();
		UserDTO dto = UserMapper.userDTOMapper(user);
		return dto;
	}

	@Override
	public UserDTO updateUser(int id, UserDTO dto) throws Exception {	
		   User user = UserMapper.userMapper(dto);
		    user.setId(id);
			user = repo.save(user);
			UserDTO userdto = UserMapper.userDTOMapper(user);
			return userdto;
		}
		
	

	@Override
	public String deleteUser(int id)throws Exception {
		repo.deleteById(id);
		return "Record has been deleted havinf id : "+id;
	}

}
