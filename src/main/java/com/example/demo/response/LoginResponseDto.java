package com.example.demo.response;

import com.example.demo.common.CommonResponseDto;
import com.example.demo.model.User;

public class LoginResponseDto extends CommonResponseDto{
	

	private User user;

	public LoginResponseDto(int status, String response, User user)
	{
		//super();
		this.status=status;
		this.response=response;
		this.user=user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		return "LoginResponseDto [user=" + user + "]";
	}

}
