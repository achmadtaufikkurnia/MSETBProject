package com.move.etb.boot.model;

import java.io.Serializable;

public class CustomerProfileData implements Serializable {

	private static final long serialVersionUID = -9132622176127729546L;
	
	private Integer userId;
	private String userName;
	private String userEmail;
	private String userAccessNo;
	private String userTacPhone;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserAccessNo() {
		return userAccessNo;
	}
	public void setUserAccessNo(String userAccessNo) {
		this.userAccessNo = userAccessNo;
	}
	public String getUserTacPhone() {
		return userTacPhone;
	}
	public void setUserTacPhone(String userTacPhone) {
		this.userTacPhone = userTacPhone;
	}
}
