package com.move.etb.boot.model;

import java.io.Serializable;

public class StatusInformationMap implements Serializable {

	private static final long serialVersionUID = -2752437148875425970L;
	
	private String isTransactionSuccessful;
	private String transactionDate;
	private String transactionReferenceNumber;
	private String transactionStatus;
	private String transactionStatusReason;
	private String transactionTime;
	
	public String getIsTransactionSuccessful() {
		return isTransactionSuccessful;
	}
	public void setIsTransactionSuccessful(String isTransactionSuccessful) {
		this.isTransactionSuccessful = isTransactionSuccessful;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getTransactionReferenceNumber() {
		return transactionReferenceNumber;
	}
	public void setTransactionReferenceNumber(String transactionReferenceNumber) {
		this.transactionReferenceNumber = transactionReferenceNumber;
	}
	public String getTransactionStatus() {
		return transactionStatus;
	}
	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
	public String getTransactionStatusReason() {
		return transactionStatusReason;
	}
	public void setTransactionStatusReason(String transactionStatusReason) {
		this.transactionStatusReason = transactionStatusReason;
	}
	public String getTransactionTime() {
		return transactionTime;
	}
	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}
}
