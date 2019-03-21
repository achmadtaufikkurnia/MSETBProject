package com.move.etb.boot.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.move.etb.boot.model.FromAccountMap;

@JsonInclude(Include.NON_NULL)
public class FromAccountMapDTO implements Serializable {

	private static final long serialVersionUID = 2325417434444041527L;
	
	private String fromAccountKey;
	private FromAccountMap fromAccountMap;
	
	public String getFromAccountKey() {
		return fromAccountKey;
	}
	public void setFromAccountKey(String fromAccountKey) {
		this.fromAccountKey = fromAccountKey;
	}
	public FromAccountMap getFromAccountMap() {
		return fromAccountMap;
	}
	public void setFromAccountMap(FromAccountMap fromAccountMap) {
		this.fromAccountMap = fromAccountMap;
	}
}
