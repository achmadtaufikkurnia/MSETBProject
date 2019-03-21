package com.move.etb.boot.model;

import java.io.Serializable;

public class FromAccountMap implements Serializable {

	private static final long serialVersionUID = -9218859990161538103L;
	
	private String accountBalanceDisplay;
	private String accountNo;
	private String accountNoDisplay;
	private String currencyCode;
	private String isoCurrencyCode;
	private String accountHolderName;
	private String applCode;
	private String productCode;
	private String branchCode;
	
	public String getAccountBalanceDisplay() {
		return accountBalanceDisplay;
	}
	public void setAccountBalanceDisplay(String accountBalanceDisplay) {
		this.accountBalanceDisplay = accountBalanceDisplay;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountNoDisplay() {
		return accountNoDisplay;
	}
	public void setAccountNoDisplay(String accountNoDisplay) {
		this.accountNoDisplay = accountNoDisplay;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getIsoCurrencyCode() {
		return isoCurrencyCode;
	}
	public void setIsoCurrencyCode(String isoCurrencyCode) {
		this.isoCurrencyCode = isoCurrencyCode;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getApplCode() {
		return applCode;
	}
	public void setApplCode(String applCode) {
		this.applCode = applCode;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
}
