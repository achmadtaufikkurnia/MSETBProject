package com.move.etb.boot.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.move.etb.boot.model.ProductCurrencyCodeMap;

@JsonInclude(Include.NON_NULL)
public class ProductCurrencyMapDTO implements Serializable {

	private static final long serialVersionUID = -6494210585375377637L;
	
	private String productCurrencyKey;
	private ProductCurrencyCodeMap productCurrencyCodeMap;
	
	public String getProductCurrencyKey() {
		return productCurrencyKey;
	}
	public void setProductCurrencyKey(String productCurrencyKey) {
		this.productCurrencyKey = productCurrencyKey;
	}
	public ProductCurrencyCodeMap getProductCurrencyCodeMap() {
		return productCurrencyCodeMap;
	}
	public void setProductCurrencyCodeMap(ProductCurrencyCodeMap productCurrencyCodeMap) {
		this.productCurrencyCodeMap = productCurrencyCodeMap;
	}
}
