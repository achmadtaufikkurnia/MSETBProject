package com.move.etb.boot.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class TACResponseData implements Serializable {

	private static final long serialVersionUID = -8580739687184460117L;
	
	private Boolean isSendSMSSuccess;
	private String tacSentDateTime;
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
	private TacViewBean tacViewBean;
	private ServiceInfoBean serviceInfoBean;
	
	public Boolean getIsSendSMSSuccess() {
		return isSendSMSSuccess;
	}
	public void setIsSendSMSSuccess(Boolean isSendSMSSuccess) {
		this.isSendSMSSuccess = isSendSMSSuccess;
	}
	public String getTacSentDateTime() {
		return tacSentDateTime;
	}
	public void setTacSentDateTime(String tacSentDateTime) {
		this.tacSentDateTime = tacSentDateTime;
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
	public TacViewBean getTacViewBean() {
		return tacViewBean;
	}
	public void setTacViewBean(TacViewBean tacViewBean) {
		this.tacViewBean = tacViewBean;
	}
	public ServiceInfoBean getServiceInfoBean() {
		return serviceInfoBean;
	}
	public void setServiceInfoBean(ServiceInfoBean serviceInfoBean) {
		this.serviceInfoBean = serviceInfoBean;
	}
}
