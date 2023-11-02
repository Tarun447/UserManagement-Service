package com.cap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.dto.UserDTO;
import com.cap.model.User;
import com.cap.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;



@Tag(name = "User Management Service",
description = "User Management Service Controller"
)
@RestController
@RequestMapping("/v1/api")
public class UserController {
	
	@Autowired
	private UserService service;

	
	@Operation(summary = "Create User",description  = "Save User" )
	@ApiResponse(responseCode = "201",description = "HTTP Create Status With 201 Code")
	@PostMapping("/user")
	public ResponseEntity<UserDTO> create(@Valid @RequestBody UserDTO dto) throws Exception
	{
			return new ResponseEntity<UserDTO>(service.save(dto), HttpStatus.CREATED);
	}
	
	
	@Operation(summary = "Get All Users",description  = "Get All Users" )
	@ApiResponse(responseCode = "200",description = "HTTP OK Status With 200 Code")
	@GetMapping("/users")
	public ResponseEntity<List<User>> fetchAllUser() throws Exception
	{
		return ResponseEntity.ok(service.finAllUsers());
	}
	
	
	@Operation(summary = "Get User By Id",description  = "Get User By Id" )
	@ApiResponse(responseCode = "200",description = "HTTP OK Status With 200 Code")
	@GetMapping("/user/{id}")
	public ResponseEntity<UserDTO> findById(@PathVariable int id) throws Exception
	{
		 return ResponseEntity.ok(service.getByuserId(id));
	}
	
	@Operation(summary = "Update User By Id",description  = "Update User By Id" )
	@ApiResponse(responseCode = "200",description = "HTTP OK Status With 200 Code")
	@PutMapping("/user/{id}")
	public ResponseEntity<UserDTO> update(@PathVariable("id") int id,@RequestBody @Valid UserDTO dto)throws Exception{
		return ResponseEntity.ok(service.updateUser(id, dto));
	}
	
	@Operation(summary = "Delete User",description  = "GDelete User" )
	@ApiResponse(responseCode = "200",description = "HTTP OK Status With 200 Code")
	@DeleteMapping("/user/{id}")
	public ResponseEntity<String> delete(@PathVariable int id) throws Exception
	{
		return ResponseEntity.ok(service.deleteUser(id));
	}
}
