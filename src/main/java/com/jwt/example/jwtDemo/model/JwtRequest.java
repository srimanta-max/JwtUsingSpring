package com.jwt.example.jwtDemo.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString

public class JwtRequest implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6303888322991812502L;
	
	
	@Getter
	@Setter
	private String userName;
	@Getter
	@Setter
	private String password; 

}
