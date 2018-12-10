package com.sathya.entity;

public class User {
	
	private int userId;
	private String userName;
	private String gmail;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", email=" + gmail + ", getUserId()=" + getUserId()
				+ ", getUserName()=" + getUserName() + ", getEmail()=" + getGmail() + "]";
	}
	

}
