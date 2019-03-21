package com.move.etb.boot.model;

import java.io.Serializable;

public class LinkAccountData implements Serializable {

	private static final long serialVersionUID = -8242950394797709648L;
	
	private String accountNo;
	private String accountType;
	private String accountCurrency;
	private String accountHolderName;
	private String accountRule;
	private String accountTypeDisplay;
	private String accountCurrencyISO;
	private String displayName;
	private String uniqueAccountNo;
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountCurrency() {
		return accountCurrency;
	}
	public void setAccountCurrency(String accountCurrency) {
		this.accountCurrency = accountCurrency;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountRule() {
		return accountRule;
	}
	public void setAccountRule(String accountRule) {
		this.accountRule = accountRule;
	}
	public String getAccountTypeDisplay() {
		return accountTypeDisplay;
	}
	public void setAccountTypeDisplay(String accountTypeDisplay) {
		this.accountTypeDisplay = accountTypeDisplay;
	}
	public String getAccountCurrencyISO() {
		return accountCurrencyISO;
	}
	public void setAccountCurrencyISO(String accountCurrencyISO) {
		this.accountCurrencyISO = accountCurrencyISO;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getUniqueAccountNo() {
		return uniqueAccountNo;
	}
	public void setUniqueAccountNo(String uniqueAccountNo) {
		this.uniqueAccountNo = uniqueAccountNo;
	}
}
