package com.cap.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;



@Schema(description = "User Management DTO")
public class UserDTO {
	
	@Schema(description = "Id")
	private int id;
	
	@Schema(description = "First Name")
	@NotEmpty(message = "User First Name should not be Empty")
	private String firstName;
	
	
	@Schema(description = "Last Name")
	@NotEmpty(message = "User Last Name should not be Empty")
	private String lastName;
	
	@Schema(description="Email")
	@Email(message = "Give a valid email id")
	@NotEmpty(message = "User Email should not be Empty")
	private String email;
	
	
	public UserDTO() {
		// TODO Auto-generated constructor stub
	}
	public UserDTO(int id, String firstName, String lastName, String email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}

}
