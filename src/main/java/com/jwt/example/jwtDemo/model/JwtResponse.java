package com.jwt.example.jwtDemo.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public class JwtResponse implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3934841684275181637L;
	
	private final String jwtToken;
	

}
