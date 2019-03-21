package com.move.etb.boot.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ProductCurrencyCodeMap implements Serializable {

	private static final long serialVersionUID = 7123663686208205919L;
	
	private String baseUnit;
	private String creationDate;
	private String currencyCode;
	private String currencyCodeISO;
	private String currencyDesc;
	private float deleted;
	private float displayOrder;
	private String imageFile;
	private String imageURL;
	private String lastModDate;
	private String mkPending;
	private String mtRecvBic;
	private float oid;
	private float status;
	
	public String getBaseUnit() {
		return baseUnit;
	}
	public void setBaseUnit(String baseUnit) {
		this.baseUnit = baseUnit;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getCurrencyCodeISO() {
		return currencyCodeISO;
	}
	public void setCurrencyCodeISO(String currencyCodeISO) {
		this.currencyCodeISO = currencyCodeISO;
	}
	public String getCurrencyDesc() {
		return currencyDesc;
	}
	public void setCurrencyDesc(String currencyDesc) {
		this.currencyDesc = currencyDesc;
	}
	public float getDeleted() {
		return deleted;
	}
	public void setDeleted(float deleted) {
		this.deleted = deleted;
	}
	public float getDisplayOrder() {
		return displayOrder;
	}
	public void setDisplayOrder(float displayOrder) {
		this.displayOrder = displayOrder;
	}
	public String getImageFile() {
		return imageFile;
	}
	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public String getLastModDate() {
		return lastModDate;
	}
	public void setLastModDate(String lastModDate) {
		this.lastModDate = lastModDate;
	}
	public String getMkPending() {
		return mkPending;
	}
	public void setMkPending(String mkPending) {
		this.mkPending = mkPending;
	}
	public String getMtRecvBic() {
		return mtRecvBic;
	}
	public void setMtRecvBic(String mtRecvBic) {
		this.mtRecvBic = mtRecvBic;
	}
	public float getOid() {
		return oid;
	}
	public void setOid(float oid) {
		this.oid = oid;
	}
	public float getStatus() {
		return status;
	}
	public void setStatus(float status) {
		this.status = status;
	}

}
