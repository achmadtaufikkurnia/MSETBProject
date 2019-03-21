package com.move.etb.boot.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.move.etb.boot.model.ProductMap;

@JsonInclude(Include.NON_NULL)
public class ProductMapDTO implements Serializable {

	private static final long serialVersionUID = -5120631997103342466L;
	
	private String productKey;
	private ProductMap productMap;
	
	public String getProductKey() {
		return productKey;
	}
	public void setProductKey(String productKey) {
		this.productKey = productKey;
	}
	public ProductMap getProductMap() {
		return productMap;
	}
	public void setProductMap(ProductMap productMap) {
		this.productMap = productMap;
	}
	
	
}
