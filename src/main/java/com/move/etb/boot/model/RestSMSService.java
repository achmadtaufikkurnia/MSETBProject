package com.move.etb.boot.model;

import java.io.Serializable;

public class RestSMSService implements Serializable {
	
	private static final long serialVersionUID = -1167433394980790834L;
	
	private String tacSentDateTime;
	private String transactionID;
	private String lastTACVerifyDateTime;
	private String currentDateTime;
	private Integer tacAttemptCount;
	private Integer smsPINAttemptCount;
	private String tac;
	private String amount;
	private String fromAccountNumber;
	private String cifNo;
	private String mobileNo;
	private String toAccount;
	private String beneName;
	private String serviceName;
	private Boolean sendSMSSuccess;
	private String smsBean;
	private Integer userId;
	private String userAlias;
	private Integer tacLifeSpan;
	private Integer smsLifeSpan;
	private String status;
	
	public String getTacSentDateTime() {
		return tacSentDateTime;
	}
	public void setTacSentDateTime(String tacSentDateTime) {
		this.tacSentDateTime = tacSentDateTime;
	}
	public String getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
	public String getLastTACVerifyDateTime() {
		return lastTACVerifyDateTime;
	}
	public void setLastTACVerifyDateTime(String lastTACVerifyDateTime) {
		this.lastTACVerifyDateTime = lastTACVerifyDateTime;
	}
	public String getCurrentDateTime() {
		return currentDateTime;
	}
	public void setCurrentDateTime(String currentDateTime) {
		this.currentDateTime = currentDateTime;
	}
	public Integer getTacAttemptCount() {
		return tacAttemptCount;
	}
	public void setTacAttemptCount(Integer tacAttemptCount) {
		this.tacAttemptCount = tacAttemptCount;
	}
	public Integer getSmsPINAttemptCount() {
		return smsPINAttemptCount;
	}
	public void setSmsPINAttemptCount(Integer smsPINAttemptCount) {
		this.smsPINAttemptCount = smsPINAttemptCount;
	}
	public String getTac() {
		return tac;
	}
	public void setTac(String tac) {
		this.tac = tac;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getFromAccountNumber() {
		return fromAccountNumber;
	}
	public void setFromAccountNumber(String fromAccountNumber) {
		this.fromAccountNumber = fromAccountNumber;
	}
	public String getCifNo() {
		return cifNo;
	}
	public void setCifNo(String cifNo) {
		this.cifNo = cifNo;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getToAccount() {
		return toAccount;
	}
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}
	public String getBeneName() {
		return beneName;
	}
	public void setBeneName(String beneName) {
		this.beneName = beneName;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public Boolean getSendSMSSuccess() {
		return sendSMSSuccess;
	}
	public void setSendSMSSuccess(Boolean sendSMSSuccess) {
		this.sendSMSSuccess = sendSMSSuccess;
	}
	public String getSmsBean() {
		return smsBean;
	}
	public void setSmsBean(String smsBean) {
		this.smsBean = smsBean;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserAlias() {
		return userAlias;
	}
	public void setUserAlias(String userAlias) {
		this.userAlias = userAlias;
	}
	public Integer getTacLifeSpan() {
		return tacLifeSpan;
	}
	public void setTacLifeSpan(Integer tacLifeSpan) {
		this.tacLifeSpan = tacLifeSpan;
	}
	public Integer getSmsLifeSpan() {
		return smsLifeSpan;
	}
	public void setSmsLifeSpan(Integer smsLifeSpan) {
		this.smsLifeSpan = smsLifeSpan;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
