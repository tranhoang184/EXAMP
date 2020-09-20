package com.vn.entities;

import java.io.Serializable;
import lombok.Data;

@Data
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7669228595077443282L;

	private String userName;
	private String pass;
	private String type;

	public User() {
		super();
	}

	public User(String userName, String pass, String type) {
		super();
		this.userName = userName;
		this.pass = pass;
		this.type = type;
	}

}
