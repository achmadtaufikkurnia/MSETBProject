package com.move.etb.boot.model;

import java.io.Serializable;
import java.util.LinkedHashMap;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ProductMap implements Serializable {

	private static final long serialVersionUID = 52498026570463930L;
	
	private String accountType;
	private String displayName;
	private String esbApplicationCode;
	private String esbCountryCode;
	private String esbDebtorClass;
	private String esbOfficerCode;
	private String esbRelationCode;
	private String esbSystemType;
	private String productBrochure;
	private String productCode;
	private String productCurrencyCodeList;
	private String productDescription;
	private String productDescription2;
	private String productDisclaimer;
	private String productDisplayOrder;
	private String productFeature;
	private String productFees;
	private String productInterest;
	private String productPicture;
	private String productPicture2;
	private String productSourceAccountCurrency;
	private String productTermsConditions;
	private String productServiceInfo;
	private LinkedHashMap<String, String> productMinAmountMap;
	private LinkedHashMap<String, String> productMinInstallmentAmountMap;
	
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getEsbApplicationCode() {
		return esbApplicationCode;
	}
	public void setEsbApplicationCode(String esbApplicationCode) {
		this.esbApplicationCode = esbApplicationCode;
	}
	public String getEsbCountryCode() {
		return esbCountryCode;
	}
	public void setEsbCountryCode(String esbCountryCode) {
		this.esbCountryCode = esbCountryCode;
	}
	public String getEsbDebtorClass() {
		return esbDebtorClass;
	}
	public void setEsbDebtorClass(String esbDebtorClass) {
		this.esbDebtorClass = esbDebtorClass;
	}
	public String getEsbOfficerCode() {
		return esbOfficerCode;
	}
	public void setEsbOfficerCode(String esbOfficerCode) {
		this.esbOfficerCode = esbOfficerCode;
	}
	public String getEsbRelationCode() {
		return esbRelationCode;
	}
	public void setEsbRelationCode(String esbRelationCode) {
		this.esbRelationCode = esbRelationCode;
	}
	public String getEsbSystemType() {
		return esbSystemType;
	}
	public void setEsbSystemType(String esbSystemType) {
		this.esbSystemType = esbSystemType;
	}
	public String getProductBrochure() {
		return productBrochure;
	}
	public void setProductBrochure(String productBrochure) {
		this.productBrochure = productBrochure;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCurrencyCodeList() {
		return productCurrencyCodeList;
	}
	public void setProductCurrencyCodeList(String productCurrencyCodeList) {
		this.productCurrencyCodeList = productCurrencyCodeList;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductDescription2() {
		return productDescription2;
	}
	public void setProductDescription2(String productDescription2) {
		this.productDescription2 = productDescription2;
	}
	public String getProductDisclaimer() {
		return productDisclaimer;
	}
	public void setProductDisclaimer(String productDisclaimer) {
		this.productDisclaimer = productDisclaimer;
	}
	public String getProductDisplayOrder() {
		return productDisplayOrder;
	}
	public void setProductDisplayOrder(String productDisplayOrder) {
		this.productDisplayOrder = productDisplayOrder;
	}
	public String getProductFeature() {
		return productFeature;
	}
	public void setProductFeature(String productFeature) {
		this.productFeature = productFeature;
	}
	public String getProductFees() {
		return productFees;
	}
	public void setProductFees(String productFees) {
		this.productFees = productFees;
	}
	public String getProductInterest() {
		return productInterest;
	}
	public void setProductInterest(String productInterest) {
		this.productInterest = productInterest;
	}
	public String getProductPicture() {
		return productPicture;
	}
	public void setProductPicture(String productPicture) {
		this.productPicture = productPicture;
	}
	public String getProductPicture2() {
		return productPicture2;
	}
	public void setProductPicture2(String productPicture2) {
		this.productPicture2 = productPicture2;
	}
	public String getProductSourceAccountCurrency() {
		return productSourceAccountCurrency;
	}
	public void setProductSourceAccountCurrency(String productSourceAccountCurrency) {
		this.productSourceAccountCurrency = productSourceAccountCurrency;
	}
	public String getProductTermsConditions() {
		return productTermsConditions;
	}
	public void setProductTermsConditions(String productTermsConditions) {
		this.productTermsConditions = productTermsConditions;
	}
	public String getProductServiceInfo() {
		return productServiceInfo;
	}
	public void setProductServiceInfo(String productServiceInfo) {
		this.productServiceInfo = productServiceInfo;
	}
	public LinkedHashMap<String, String> getProductMinAmountMap() {
		return productMinAmountMap;
	}
	public void setProductMinAmountMap(LinkedHashMap<String, String> productMinAmountMap) {
		this.productMinAmountMap = productMinAmountMap;
	}
	public LinkedHashMap<String, String> getProductMinInstallmentAmountMap() {
		return productMinInstallmentAmountMap;
	}
	public void setProductMinInstallmentAmountMap(LinkedHashMap<String, String> productMinInstallmentAmountMap) {
		this.productMinInstallmentAmountMap = productMinInstallmentAmountMap;
	}
}
