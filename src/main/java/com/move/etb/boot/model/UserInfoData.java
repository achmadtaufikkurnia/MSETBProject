package com.move.etb.boot.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class UserInfoData implements Serializable {

	private static final long serialVersionUID = 3909957663978884279L;
	
	private List<LinkAccountData> linkAccountList;
	
	private CustomerProfileData restCustProfile;
	
	private String responseCode;
	private String responseMessage;
	
	private String userId;
	private String cifNo;
	private String productCustomerName;
	private String productCustomerEmail;
	private String tacPhoneNumber;
	private String sessionId;
	
	private String linkedAccountsString;
	
	public CustomerProfileData getRestCustProfile() {
		return restCustProfile;
	}
	public void setRestCustProfile(CustomerProfileData restCustProfile) {
		this.restCustProfile = restCustProfile;
	}
	public String getCifNo() {
		return cifNo;
	}
	public void setCifNo(String cifNo) {
		this.cifNo = cifNo;
	}
	public String getProductCustomerName() {
		return productCustomerName;
	}
	public void setProductCustomerName(String productCustomerName) {
		this.productCustomerName = productCustomerName;
	}
	public String getProductCustomerEmail() {
		return productCustomerEmail;
	}
	public void setProductCustomerEmail(String productCustomerEmail) {
		this.productCustomerEmail = productCustomerEmail;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public List<LinkAccountData> getLinkAccountList() {
		return linkAccountList;
	}
	public void setLinkAccountList(List<LinkAccountData> linkAccountList) {
		this.linkAccountList = linkAccountList;
	}
	public String getLinkedAccountsString() {
		return linkedAccountsString;
	}
	public void setLinkedAccountsString(String linkedAccountsString) {
		this.linkedAccountsString = linkedAccountsString;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTacPhoneNumber() {
		return tacPhoneNumber;
	}
	public void setTacPhoneNumber(String tacPhoneNumber) {
		this.tacPhoneNumber = tacPhoneNumber;
	}
}
