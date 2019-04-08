package com.move.etb.boot.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SignatureData implements Serializable {

	private static final long serialVersionUID = 4572908617401518505L;
	
	private Signature signatureData;
	
	private String responseCode;
	
	private String responseMessageEN;
	
	private String responseMessageIN;
	
	private String errorSystemMessage;
	
	private String timestamp;

	public Signature getSignatureData() {
		return signatureData;
	}

	public void setSignatureData(Signature signatureData) {
		this.signatureData = signatureData;
	}

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

	public String getErrorSystemMessage() {
		return errorSystemMessage;
	}

	public void setErrorSystemMessage(String errorSystemMessage) {
		this.errorSystemMessage = errorSystemMessage;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
}
