package com.move.etb.boot.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.move.etb.boot.dto.ProductMapDTO;

@JsonInclude(Include.NON_NULL)
public class ProductDescription implements Serializable {

	private static final long serialVersionUID = 3610726404695801012L;
	
	private String delegationErrorParams;
	private String displayName;
	private String effectiveDate;
	private String effectiveDateDisplay;
	private String errorCode;
	private String errorParams;
	private Boolean isSuccessful;
	private String loggerErrorCode;
	private String loggerErrorParams;
	private String loggerResponseCode;
	private String loggerResponseMessage;
	private String loggerServiceName;
	private String payMode;
	private String paymentFrequencyDisplay;
	private String productBrochure;
	private String productDescription2;
	private String productDisclaimer;
	private Integer productDisplayOrder;
	private String productFees;
	private String productPicture2;
	private String productTermsConditions;
	private String responseCode;
	private String responseMessage;
	private Integer responseTime;
	private String serviceInfoBean;
	private String serviceName;
	private Integer statusCode;
	private String statusReason;
	private Integer tacAttemptCount;
	private String terminationDate;
	private String terminationDateDisplay;
	private Integer totalTime;
	
	private List<ProductMapDTO> listProductMap;
	
	private LinkedHashMap<String, ProductMap> topProductMap;
	
	private String topProductMapString;
	
	public String getDelegationErrorParams() {
		return delegationErrorParams;
	}
	public void setDelegationErrorParams(String delegationErrorParams) {
		this.delegationErrorParams = delegationErrorParams;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public String getEffectiveDateDisplay() {
		return effectiveDateDisplay;
	}
	public void setEffectiveDateDisplay(String effectiveDateDisplay) {
		this.effectiveDateDisplay = effectiveDateDisplay;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorParams() {
		return errorParams;
	}
	public void setErrorParams(String errorParams) {
		this.errorParams = errorParams;
	}
	public Boolean getIsSuccessful() {
		return isSuccessful;
	}
	public void setIsSuccessful(Boolean isSuccessful) {
		this.isSuccessful = isSuccessful;
	}
	public String getLoggerErrorCode() {
		return loggerErrorCode;
	}
	public void setLoggerErrorCode(String loggerErrorCode) {
		this.loggerErrorCode = loggerErrorCode;
	}
	public String getLoggerErrorParams() {
		return loggerErrorParams;
	}
	public void setLoggerErrorParams(String loggerErrorParams) {
		this.loggerErrorParams = loggerErrorParams;
	}
	public String getLoggerResponseCode() {
		return loggerResponseCode;
	}
	public void setLoggerResponseCode(String loggerResponseCode) {
		this.loggerResponseCode = loggerResponseCode;
	}
	public String getLoggerResponseMessage() {
		return loggerResponseMessage;
	}
	public void setLoggerResponseMessage(String loggerResponseMessage) {
		this.loggerResponseMessage = loggerResponseMessage;
	}
	public String getLoggerServiceName() {
		return loggerServiceName;
	}
	public void setLoggerServiceName(String loggerServiceName) {
		this.loggerServiceName = loggerServiceName;
	}
	public String getPayMode() {
		return payMode;
	}
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}
	public String getPaymentFrequencyDisplay() {
		return paymentFrequencyDisplay;
	}
	public void setPaymentFrequencyDisplay(String paymentFrequencyDisplay) {
		this.paymentFrequencyDisplay = paymentFrequencyDisplay;
	}
	public String getProductBrochure() {
		return productBrochure;
	}
	public void setProductBrochure(String productBrochure) {
		this.productBrochure = productBrochure;
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
	public Integer getProductDisplayOrder() {
		return productDisplayOrder;
	}
	public void setProductDisplayOrder(Integer productDisplayOrder) {
		this.productDisplayOrder = productDisplayOrder;
	}
	public String getProductFees() {
		return productFees;
	}
	public void setProductFees(String productFees) {
		this.productFees = productFees;
	}
	public String getProductPicture2() {
		return productPicture2;
	}
	public void setProductPicture2(String productPicture2) {
		this.productPicture2 = productPicture2;
	}
	public String getProductTermsConditions() {
		return productTermsConditions;
	}
	public void setProductTermsConditions(String productTermsConditions) {
		this.productTermsConditions = productTermsConditions;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public Integer getResponseTime() {
		return responseTime;
	}
	public void setResponseTime(Integer responseTime) {
		this.responseTime = responseTime;
	}
	public String getServiceInfoBean() {
		return serviceInfoBean;
	}
	public void setServiceInfoBean(String serviceInfoBean) {
		this.serviceInfoBean = serviceInfoBean;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusReason() {
		return statusReason;
	}
	public void setStatusReason(String statusReason) {
		this.statusReason = statusReason;
	}
	public Integer getTacAttemptCount() {
		return tacAttemptCount;
	}
	public void setTacAttemptCount(Integer tacAttemptCount) {
		this.tacAttemptCount = tacAttemptCount;
	}
	public String getTerminationDate() {
		return terminationDate;
	}
	public void setTerminationDate(String terminationDate) {
		this.terminationDate = terminationDate;
	}
	public String getTerminationDateDisplay() {
		return terminationDateDisplay;
	}
	public void setTerminationDateDisplay(String terminationDateDisplay) {
		this.terminationDateDisplay = terminationDateDisplay;
	}
	public Integer getTotalTime() {
		return totalTime;
	}
	public void setTotalTime(Integer totalTime) {
		this.totalTime = totalTime;
	}
	public LinkedHashMap<String, ProductMap> getTopProductMap() {
		return topProductMap;
	}
	public void setTopProductMap(LinkedHashMap<String, ProductMap> topProductMap) {
		this.topProductMap = topProductMap;
	}
	public List<ProductMapDTO> getListProductMap() {
		return listProductMap;
	}
	public void setListProductMap(List<ProductMapDTO> listProductMap) {
		this.listProductMap = listProductMap;
	}
	public String getTopProductMapString() {
		return topProductMapString;
	}
	public void setTopProductMapString(String topProductMapString) {
		this.topProductMapString = topProductMapString;
	}
}
