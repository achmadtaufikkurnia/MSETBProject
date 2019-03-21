package com.move.etb.boot.model;

import java.io.Serializable;

public class TacBean implements Serializable {

	private static final long serialVersionUID = 7091416880377562576L;
	
	private String serviceName;
	private String toAccount;
	private String beneName;
	private String amount;
	private String fromAccount;
	private String tacMobileNo;
	
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
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
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}
	public String getTacMobileNo() {
		return tacMobileNo;
	}
	public void setTacMobileNo(String tacMobileNo) {
		this.tacMobileNo = tacMobileNo;
	}
}
