package com.cap.model;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Schema(description = "User Model Schema")
@Entity
@Table(name = "User_Management")
@SuppressWarnings("serial")
public class User implements Serializable {
	
	@Schema(description = "ID")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id",nullable = false)
	private int id;
	
	@Schema(description = "First Name")
	@Column(name="firstName",nullable = false)
	private String firstName;
	
	@Schema(description = "Last Name")
	@Column(name="lastName",nullable = false)
	private String lastName;
	
	
	@Schema(description = "Email")
	@Column(name="email",nullable = false)
	private String email;
	public User() {
		
	}
	public User(int id, String firstName, String lastName, String email) {
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
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	

}
