package com.move.etb.boot.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.move.etb.boot.constant.ApplicationConstants;
import com.move.etb.boot.model.CustomerProfileData;
import com.move.etb.boot.model.ResponseData;
import com.move.etb.boot.model.TACResponseData;
import com.move.etb.boot.model.UserInfoData;
import com.move.etb.boot.service.UserDataService;
import com.move.etb.boot.util.JsonAPI;

@Service
@Component
@PropertySource("classpath:move-etb.properties")
public class UserDataServiceImpl implements UserDataService {
	
	private static final Logger logger = LogManager.getLogger(UserDataServiceImpl.class);
	
	@Value("${url.user.info}")
	private String urlUserInfo;
	
	@Value("${url.tac.request}")
	private String urlTACRequest;
	
	@Value("${ip.address}")
	private String ipAddress;

	@Override
	public ResponseData getUserInfoData(String requestPayload) throws Exception {
		ResponseData response = null;
		UserInfoData data = null;	
		try {
			JsonAPI jsonAPI = new JsonAPI();
			Gson gson = new Gson();
			response = new ResponseData();
			
			String userInfo = jsonAPI.callAPIJson(requestPayload, urlUserInfo);
			data = gson.fromJson(userInfo, UserInfoData.class);
			if(data!=null) {
				if(data.getResponseCode().equals(ApplicationConstants.RESPONSE_CODE_SUCCESS)) {
					if(data.getRestCustProfile()!=null) {
						CustomerProfileData customerProfile = data.getRestCustProfile();
						if(customerProfile.getUserAccessNo()!=null && !customerProfile.getUserAccessNo().isEmpty()) {
							data.setCifNo(data.getRestCustProfile().getUserAccessNo());
						}
						if(customerProfile.getUserName()!=null && !customerProfile.getUserName().isEmpty()) {
							data.setProductCustomerName(customerProfile.getUserName());
						}
						if(customerProfile.getUserEmail()!=null && !customerProfile.getUserEmail().isEmpty()) {
							data.setProductCustomerEmail(customerProfile.getUserEmail());
						}
						if(customerProfile.getUserId()!=null) {
							data.setUserId(customerProfile.getUserId().toString());
						}
						if(customerProfile.getUserTacPhone()!=null && !customerProfile.getUserTacPhone().isEmpty()) {
							data.setTacPhoneNumber(customerProfile.getUserTacPhone());
						}
						data.setRestCustProfile(null);
					}
					if(data.getLinkAccountList()!=null && data.getLinkAccountList().size() > 0) {
						data.setLinkedAccountsString(gson.toJson(data.getLinkAccountList()));
						data.setLinkAccountList(null);
					}
					response.setUserInfoData(data);
					response.setResponseCode(data.getResponseCode());
					response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_SUCCESS);
					response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_SUCCESS);
				}else {
					response.setResponseCode(data.getResponseCode());
					if(data.getResponseMessage()!=null && !data.getResponseMessage().isEmpty()) {
						response.setResponseMessageEN(data.getResponseMessage());
						response.setResponseMessageIN(data.getResponseMessage());
					}else {
						response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_EN);
						response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_IN);
					}
					logger.info("REQUEST USERINFO :: "+requestPayload.replaceAll("\n", "").replaceAll("\r", ""));
					logger.info("RESPONSE USERINFO :: "+userInfo.replaceAll("\n", "").replaceAll("\r", ""));
				}
			}else {
				response.setResponseCode(ApplicationConstants.RESPONSE_CODE_ERROR);
				response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_EN);
				response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_IN);
			}
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw e;
		}
		return response;
	}

	@Override
	public ResponseData getTACResponse(String requestPayload) throws Exception {
		ResponseData response = null;
		TACResponseData data = null;	
		try {
			JsonAPI jsonAPI = new JsonAPI();
			Gson gson = new Gson();
			response = new ResponseData();
			
			JSONObject json = new JSONObject(requestPayload);
			json.put(ApplicationConstants.REMOTE_IP_ADDR, ipAddress);
			
			String requestTac = jsonAPI.callAPIJson(requestPayload, urlTACRequest);
			data = gson.fromJson(requestTac, TACResponseData.class);
			if(data!=null) {
				if(data.getResponseCode().equals(ApplicationConstants.RESPONSE_CODE_SUCCESS)) {
					if(data.getTacViewBean()!=null) {
						if(data.getTacViewBean().getRestSMSService()!=null) {
							data.getTacViewBean().setRestSMSServiceString(gson.toJson(data.getTacViewBean().getRestSMSService()));
						}
					}
					response.setTacResponseData(data);
					response.setResponseCode(data.getResponseCode());
					response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_SUCCESS);
					response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_SUCCESS);
				}else {
					response.setResponseCode(data.getResponseCode());
					if(data.getResponseMessage()!=null && !data.getResponseMessage().isEmpty()) {
						response.setResponseMessageEN(data.getResponseMessage());
						response.setResponseMessageIN(data.getResponseMessage());
					}else {
						response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_EN);
						response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_IN);
					}
					logger.info("REQUEST TAC :: "+requestPayload.replaceAll("\n", "").replaceAll("\r", ""));
					logger.info("RESPONSE TAC :: "+requestTac.replaceAll("\n", "").replaceAll("\r", ""));
				}
			}else {
				response.setResponseCode(ApplicationConstants.RESPONSE_CODE_ERROR);
				response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_EN);
				response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_IN);
				logger.info("REQUEST TAC :: "+requestPayload.replaceAll("\n", "").replaceAll("\r", ""));
				logger.info("RESPONSE TAC :: "+requestTac.replaceAll("\n", "").replaceAll("\r", ""));
			}
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw e;
		}
		return response;
	}

}
