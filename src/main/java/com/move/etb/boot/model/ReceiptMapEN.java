package com.move.etb.boot.model;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class ReceiptMapEN implements Serializable {

	private static final long serialVersionUID = -6591297540573517998L;
	
	 private String Status;
	 @SerializedName("Bill Reference No.")
	 private String billReferenceNo;
	 @SerializedName("Transaction Date")
	 private String transactionData;
	 private String Amount;
	 @SerializedName("From Account")
	 private String fromAccount;
	 @SerializedName("Transaction Type")
	 private String transactionType;
	 @SerializedName("Full Name")
	 private String fullName;
	 
	public String getBillReferenceNo() {
		return billReferenceNo;
	}
	public void setBillReferenceNo(String billReferenceNo) {
		this.billReferenceNo = billReferenceNo;
	}
	public String getTransactionData() {
		return transactionData;
	}
	public void setTransactionData(String transactionData) {
		this.transactionData = transactionData;
	}
	public String getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
}
