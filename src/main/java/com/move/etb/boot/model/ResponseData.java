package com.move.etb.boot.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@JsonInclude(Include.NON_NULL)
public class ResponseData implements Serializable {
	
	private static final long serialVersionUID = 7828345315563012046L;
	
	private String responseCode;
	private String responseMessageEN;
	private String responseMessageIN;
	
	private ProductData productData;
	
	private ProductDescription productDesc;
	
	private ProductDetail productDetail;
	
	private SavingConfirmation savingConfirmation;
	
	private SavingResult savingResult;
	
	private UserInfoData userInfoData;
	
	private TACResponseData tacResponseData;

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMessageEN() {
		return responseMessageEN;
	}

	public void setResponseMessageEN(String responseMessageEN) {
		this.responseMessageEN = responseMessageEN;
	}

	public String getResponseMessageIN() {
		return responseMessageIN;
	}

	public void setResponseMessageIN(String responseMessageIN) {
		this.responseMessageIN = responseMessageIN;
	}

	public ProductData getProductData() {
		return productData;
	}

	public void setProductData(ProductData productData) {
		this.productData = productData;
	}

	public ProductDescription getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(ProductDescription productDesc) {
		this.productDesc = productDesc;
	}

	public ProductDetail getProductDetail() {
		return productDetail;
	}

	public void setProductDetail(ProductDetail productDetail) {
		this.productDetail = productDetail;
	}

	public SavingConfirmation getSavingConfirmation() {
		return savingConfirmation;
	}

	public void setSavingConfirmation(SavingConfirmation savingConfirmation) {
		this.savingConfirmation = savingConfirmation;
	}

	public SavingResult getSavingResult() {
		return savingResult;
	}

	public void setSavingResult(SavingResult savingResult) {
		this.savingResult = savingResult;
	}

	public UserInfoData getUserInfoData() {
		return userInfoData;
	}

	public void setUserInfoData(UserInfoData userInfoData) {
		this.userInfoData = userInfoData;
	}

	public TACResponseData getTacResponseData() {
		return tacResponseData;
	}

	public void setTacResponseData(TACResponseData tacResponseData) {
		this.tacResponseData = tacResponseData;
	}
}
