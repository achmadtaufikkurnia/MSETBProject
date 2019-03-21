package com.move.etb.boot.model;

import java.io.Serializable;

public class MonetaryInformationMap implements Serializable {

	private static final long serialVersionUID = -8173442386474821111L;
	
	private String localAmount;
	private String localAmountDisplay;
	private String toCurrencyRate;
	private String debitAmount;
	private String debitAmountDisplay;
	private String fromCurrencyRate;
	private String toAmount;
	private String toAmountDisplay;
	
	public String getLocalAmount() {
		return localAmount;
	}
	public void setLocalAmount(String localAmount) {
		this.localAmount = localAmount;
	}
	public String getLocalAmountDisplay() {
		return localAmountDisplay;
	}
	public void setLocalAmountDisplay(String localAmountDisplay) {
		this.localAmountDisplay = localAmountDisplay;
	}
	public String getToCurrencyRate() {
		return toCurrencyRate;
	}
	public void setToCurrencyRate(String toCurrencyRate) {
		this.toCurrencyRate = toCurrencyRate;
	}
	public String getDebitAmount() {
		return debitAmount;
	}
	public void setDebitAmount(String debitAmount) {
		this.debitAmount = debitAmount;
	}
	public String getDebitAmountDisplay() {
		return debitAmountDisplay;
	}
	public void setDebitAmountDisplay(String debitAmountDisplay) {
		this.debitAmountDisplay = debitAmountDisplay;
	}
	public String getFromCurrencyRate() {
		return fromCurrencyRate;
	}
	public void setFromCurrencyRate(String fromCurrencyRate) {
		this.fromCurrencyRate = fromCurrencyRate;
	}
	public String getToAmount() {
		return toAmount;
	}
	public void setToAmount(String toAmount) {
		this.toAmount = toAmount;
	}
	public String getToAmountDisplay() {
		return toAmountDisplay;
	}
	public void setToAmountDisplay(String toAmountDisplay) {
		this.toAmountDisplay = toAmountDisplay;
	}
}
