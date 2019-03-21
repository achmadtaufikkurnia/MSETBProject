package com.move.etb.boot.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.move.etb.boot.constant.ApplicationConstants;
import com.move.etb.boot.model.ProductDescription;
import com.move.etb.boot.model.ResponseData;
import com.move.etb.boot.service.ProductETBService;
import com.move.etb.boot.service.UserDataService;

@RestController
@RequestMapping(value = "/etb")
public class MSMoveETBController {
	
	private static final Logger logger = LogManager.getLogger(MSMoveETBController.class);
	
	@Autowired
	private ProductETBService productETBService;
	
	@Autowired
	private UserDataService userInfoService;

	@RequestMapping(value = "/getProductList", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseData getProductList(@RequestBody String requestPayload,HttpServletRequest request) {
		ResponseData response = new ResponseData();
		try {
			response = productETBService.getProductListData(requestPayload);
		} catch (Exception e) {
			response.setResponseCode(ApplicationConstants.RESPONSE_CODE_ERROR);
			response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_EN);
			response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_IN);
			logger.error(e.getMessage(),e);
		}
		return response;
	}
	
	@RequestMapping(value = "/getProductDesc", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseData getProductDesc(@RequestBody String requestPayload,HttpServletRequest request) {
		ProductDescription data = null;
		ResponseData response = new ResponseData();
		try {
			data = productETBService.getProductDescData(requestPayload);
			if(data!=null) {
				if(data.getResponseCode()!=null && data.getResponseCode().equals(ApplicationConstants.RESPONSE_CODE_SUCCESS)) {
					response.setResponseCode(data.getResponseCode());
					response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_SUCCESS);
					response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_SUCCESS);
					response.setProductDesc(data);
				}else {
					response.setResponseCode(data.getResponseCode());
					response.setResponseMessageEN(data.getResponseMessage());
					response.setResponseMessageIN(data.getResponseMessage());
				}
			}else {
				response.setResponseCode(ApplicationConstants.RESPONSE_CODE_ERROR);
				response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_DATA_NOT_FOUND_EN);
				response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_DATA_NOT_FOUND_IN);
			}
		} catch (Exception e) {
			response.setResponseCode(ApplicationConstants.RESPONSE_CODE_ERROR);
			response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_EN);
			response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_IN);
			logger.error(e.getMessage(),e);
		}
		return response;
	}
	
	@RequestMapping(value = "/getProductDetail", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseData getProductDetail(@RequestBody String requestPayload,HttpServletRequest request) {
		ResponseData response = new ResponseData();
		try {
			response = productETBService.getProductDetailData(requestPayload);
		} catch (Exception e) {
			response.setResponseCode(ApplicationConstants.RESPONSE_CODE_ERROR);
			response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_EN);
			response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_IN);
			logger.error(e.getMessage(),e);
		}
		return response;
	}
	
	@RequestMapping(value = "/savingConfirmationProcess", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseData savingConfirmationProcess(@RequestBody String requestPayload,HttpServletRequest request) {
		ResponseData response = new ResponseData();
		try {
			response = productETBService.savingConfirmationETBProcess(requestPayload);
		} catch (Exception e) {
			response.setResponseCode(ApplicationConstants.RESPONSE_CODE_ERROR);
			response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_EN);
			response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_IN);
			logger.error(e.getMessage(),e);
		}
		return response;
	}
	
	@RequestMapping(value = "/savingResultProcess", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseData savingResultProcess(@RequestBody String requestPayload,HttpServletRequest request) {
		ResponseData response = new ResponseData();
		try {
			response = productETBService.savingResultETBProcess(requestPayload);
		} catch (Exception e) {
			response.setResponseCode(ApplicationConstants.RESPONSE_CODE_ERROR);
			response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_EN);
			response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_IN);
			logger.error(e.getMessage(),e);
		}
		return response;
	}
	
	@RequestMapping(value = "/getUserInfo", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseData getUserInfo(@RequestBody String requestPayload,HttpServletRequest request) {
		ResponseData response = new ResponseData();
		try {
			response = userInfoService.getUserInfoData(requestPayload);
		} catch (Exception e) {
			response.setResponseCode(ApplicationConstants.RESPONSE_CODE_ERROR);
			response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_EN);
			response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_IN);
			logger.error(e.getMessage(),e);
		}
		return response;
	} 
	
	@RequestMapping(value = "/getRequestTAC", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseData getRequestTAC(@RequestBody String requestPayload,HttpServletRequest request) {
		ResponseData response = new ResponseData();
		try {
			response = userInfoService.getTACResponse(requestPayload);
		} catch (Exception e) {
			response.setResponseCode(ApplicationConstants.RESPONSE_CODE_ERROR);
			response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_EN);
			response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_IN);
			logger.error(e.getMessage(),e);
		}
		return response;
	} 
}
