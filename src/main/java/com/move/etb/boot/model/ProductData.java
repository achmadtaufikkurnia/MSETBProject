package com.move.etb.boot.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.move.etb.boot.dto.ProductMapDTO;

@JsonInclude(Include.NON_NULL)
public class ProductData implements Serializable {

	private static final long serialVersionUID = 7572500781971445596L;
	
	private String displayName;
	private String minAmount;
	private String minInstallmentAmount;
	private String pageType;
	private String productDescription;
	private String productDescriptionML;
	private String productDisplayOrder;
	private String productFeature;
	private String productPicture;
	private String productSourceAccountCurrency;
	private String productTermsConditions;
	private String responseCode;
	private String responseMessage;
	private String serviceName;
	private String errorCode;
	private String errorParams;
	private String loggerResponseCode;
	private String loggerResponseMessage;
	private String loggerServiceName;
	private String loggerErrorCode;
	private String loggerErrorParams;
	private String delegationErrorParams;
	private Integer tacAttemptCount;
	private String payMode;
	private String effectiveDateDisplay;
	private String effectiveDate;
	private String terminationDate;
	private String terminationDateDisplay;
	private String paymentFrequencyDisplay;
	private List<ProductMapDTO> listProductMap;
	private LinkedHashMap<String, ProductMap> topProductMap;
	private ServiceInfoBean serviceInfoBean;
	
	private String topProductMapString;
	private String serviceInfoBeanString;
	
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getMinAmount() {
		return minAmount;
	}
	public void setMinAmount(String minAmount) {
		this.minAmount = minAmount;
	}
	public String getMinInstallmentAmount() {
		return minInstallmentAmount;
	}
	public void setMinInstallmentAmount(String minInstallmentAmount) {
		this.minInstallmentAmount = minInstallmentAmount;
	}
	public String getPageType() {
		return pageType;
	}
	public void setPageType(String pageType) {
		this.pageType = pageType;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductDescriptionML() {
		return productDescriptionML;
	}
	public void setProductDescriptionML(String productDescriptionML) {
		this.productDescriptionML = productDescriptionML;
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
	public String getProductPicture() {
		return productPicture;
	}
	public void setProductPicture(String productPicture) {
		this.productPicture = productPicture;
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
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
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
	public String getDelegationErrorParams() {
		return delegationErrorParams;
	}
	public void setDelegationErrorParams(String delegationErrorParams) {
		this.delegationErrorParams = delegationErrorParams;
	}
	public Integer getTacAttemptCount() {
		return tacAttemptCount;
	}
	public void setTacAttemptCount(Integer tacAttemptCount) {
		this.tacAttemptCount = tacAttemptCount;
	}
	public String getPayMode() {
		return payMode;
	}
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}
	public String getEffectiveDateDisplay() {
		return effectiveDateDisplay;
	}
	public void setEffectiveDateDisplay(String effectiveDateDisplay) {
		this.effectiveDateDisplay = effectiveDateDisplay;
	}
	public String getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
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
	public String getPaymentFrequencyDisplay() {
		return paymentFrequencyDisplay;
	}
	public void setPaymentFrequencyDisplay(String paymentFrequencyDisplay) {
		this.paymentFrequencyDisplay = paymentFrequencyDisplay;
	}
	public List<ProductMapDTO> getListProductMap() {
		return listProductMap;
	}
	public void setListProductMap(List<ProductMapDTO> listProductMap) {
		this.listProductMap = listProductMap;
	}
	public LinkedHashMap<String, ProductMap> getTopProductMap() {
		return topProductMap;
	}
	public void setTopProductMap(LinkedHashMap<String, ProductMap> topProductMap) {
		this.topProductMap = topProductMap;
	}
	public String getTopProductMapString() {
		return topProductMapString;
	}
	public void setTopProductMapString(String topProductMapString) {
		this.topProductMapString = topProductMapString;
	}
	public ServiceInfoBean getServiceInfoBean() {
		return serviceInfoBean;
	}
	public void setServiceInfoBean(ServiceInfoBean serviceInfoBean) {
		this.serviceInfoBean = serviceInfoBean;
	}
	public String getServiceInfoBeanString() {
		return serviceInfoBeanString;
	}
	public void setServiceInfoBeanString(String serviceInfoBeanString) {
		this.serviceInfoBeanString = serviceInfoBeanString;
	}
}
