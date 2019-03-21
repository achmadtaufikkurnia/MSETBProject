package com.move.etb.boot.model;

import java.io.Serializable;

public class TacViewBean implements Serializable {

	private static final long serialVersionUID = 8062220333246207176L;
	
	private String smsService;
	private String generatedTAC;
	private String creationTime;
	private String status;
	private String mobileNo;
	private RestSMSService restSMSService;
	
	private String restSMSServiceString;
	
	public String getSmsService() {
		return smsService;
	}
	public void setSmsService(String smsService) {
		this.smsService = smsService;
	}
	public String getGeneratedTAC() {
		return generatedTAC;
	}
	public void setGeneratedTAC(String generatedTAC) {
		this.generatedTAC = generatedTAC;
	}
	public String getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public RestSMSService getRestSMSService() {
		return restSMSService;
	}
	public void setRestSMSService(RestSMSService restSMSService) {
		this.restSMSService = restSMSService;
	}
	public String getRestSMSServiceString() {
		return restSMSServiceString;
	}
	public void setRestSMSServiceString(String restSMSServiceString) {
		this.restSMSServiceString = restSMSServiceString;
	}
}
