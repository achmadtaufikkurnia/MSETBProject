package com.move.etb.boot.service;

import com.move.etb.boot.model.ResponseData;

public interface UserDataService {
	
	public ResponseData getUserInfoData(String requestPayload) throws Exception;
	
	public ResponseData getTACResponse(String requestPayload) throws Exception;

}
