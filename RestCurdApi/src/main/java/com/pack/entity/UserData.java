package com.pack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="User_Tab")
public class UserData {
	@Id
	private int userId;
	
	@Column(length=20)
	private String userName;
	@Column(length=20)
	
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
		return "User [userId=" + userId + ", userName=" + userName + ", gmail=" + gmail + ", getUserId()=" + getUserId()
				+ ", getUserName()=" + getUserName() + ", getGmail()=" + getGmail() + "]";
	}
	
	
	

}
