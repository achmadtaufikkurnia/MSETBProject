package com.move.etb.boot.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.move.etb.boot.constant.ApplicationConstants;
import com.move.etb.boot.dto.CommonListDTO;
import com.move.etb.boot.dto.FromAccountMapDTO;
import com.move.etb.boot.dto.ProductCurrencyMapDTO;
import com.move.etb.boot.dto.ProductMapDTO;
import com.move.etb.boot.model.FromAccountMap;
import com.move.etb.boot.model.ProductCurrencyCodeMap;
import com.move.etb.boot.model.ProductData;
import com.move.etb.boot.model.ProductDescription;
import com.move.etb.boot.model.ProductDetail;
import com.move.etb.boot.model.ProductMap;
import com.move.etb.boot.model.ResponseData;
import com.move.etb.boot.model.SavingConfirmation;
import com.move.etb.boot.model.SavingResult;
import com.move.etb.boot.service.ProductETBService;
import com.move.etb.boot.util.JsonAPI;

@Service
@Component
@PropertySource("classpath:move-etb.properties")
public class ProductETBServiceImpl implements ProductETBService {
	
	private static final Logger logger = LogManager.getLogger(ProductETBServiceImpl.class);
	
	@Value("${url.productlist}")
	private String urlProductList;
	
	@Value("${url.productdesc}")
	private String urlProductDesc;
	
	@Value("${url.productdetail}")
	private String urlProductDetail;
	
	@Value("${url.saving.confirmation}")
	private String urlSavingConfirmation;
	
	@Value("${url.saving.result}")
	private String urlSavingResult;
	
	@Value("${ip.address}")
	private String ipAddress;
	
//	@Autowired
//	private UserDataService userDataService;

	@Override
	public ResponseData getProductListData(String requestPayload) throws Exception {
		ResponseData response = null;
		ProductData data = null;
		List<ProductMapDTO> listData = null;
		try {
			JsonAPI jsonAPI = new JsonAPI();
			Gson gson = new Gson();
			response = new ResponseData();
			
			JSONObject json = new JSONObject(requestPayload);
			String productType = json.getString(ApplicationConstants.PRODUCT_TYPE);
			json.remove(ApplicationConstants.PRODUCT_TYPE);
			
			String productList = jsonAPI.callAPIJson(json.toString(), urlProductList);
			data = gson.fromJson(productList, ProductData.class);
			
			if(data!=null) {
				if(data.getResponseCode().equals(ApplicationConstants.RESPONSE_CODE_SUCCESS)) {
					if(data.getTopProductMap()!=null && data.getTopProductMap().size() > 0) {
						List<String> productTypeList = Arrays.asList(productType.split(ApplicationConstants.PIPELINE_DELIMITER));
						listData = new ArrayList<ProductMapDTO>();
						for (Map.Entry<String, ProductMap> entry : data.getTopProductMap().entrySet()) {
							Boolean matchData = productTypeList.stream().anyMatch(acctType -> entry.getValue().getAccountType()!=null && entry.getValue().getAccountType().equals(acctType));
							if(matchData) {
								ProductMapDTO dto = new ProductMapDTO();
							    dto.setProductKey(entry.getKey());
							    dto.setProductMap(entry.getValue());
							    listData.add(dto);
							}
						}
						data.setListProductMap(listData);
						if(data.getTopProductMap()!=null) {
							data.setTopProductMapString(gson.toJson(data.getTopProductMap()));
						}
						data.setTopProductMap(null);
						if(data.getServiceInfoBean()!=null) {
							data.setServiceInfoBeanString(gson.toJson(data.getServiceInfoBean()));
						}
						
						response.setProductData(data);
						response.setResponseCode(data.getResponseCode());
						response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_SUCCESS);
						response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_SUCCESS);
					}else {
						response.setResponseCode(ApplicationConstants.RESPONSE_CODE_ERROR);
						response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_DATA_NOT_FOUND_EN);
						response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_DATA_NOT_FOUND_IN);
					}
				}else {
					response.setResponseCode(data.getResponseCode());
					if(data.getResponseMessage()!=null && !data.getResponseMessage().isEmpty()) {
						response.setResponseMessageEN(data.getResponseMessage());
						response.setResponseMessageIN(data.getResponseMessage());
					}else {
						response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_EN);
						response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_IN);
					}
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
	public ProductDescription getProductDescData(String requestPayload) throws Exception {
		ProductDescription data = null;
//		List<ProductMapDTO> listData = null;
		try {
			JsonAPI jsonAPI = new JsonAPI();
			Gson gson = new Gson();			
//			JSONObject json = new JSONObject(requestPayload);
//			String topProductMap = json.getJSONObject(ApplicationConstants.PRODUCT_DESC_TOPPRODUCTMAP).toString();
//			json.put(ApplicationConstants.PRODUCT_DESC_TOPPRODUCTMAP, topProductMap);
//			String productDesc = jsonAPI.callAPIJson(json.toString(), urlProductDesc);
			String productDesc = jsonAPI.callAPIJson(requestPayload, urlProductDesc);
			data = gson.fromJson(productDesc, ProductDescription.class);
			
			if(data!=null && (data.getTopProductMap()!=null && data.getTopProductMap().size() > 0)) {
//				listData = new ArrayList<ProductMapDTO>();
//				for (Map.Entry<String, ProductMap> entry : data.getTopProductMap().entrySet()) {
//					ProductMapDTO dto = new ProductMapDTO();
//				    dto.setProductKey(entry.getKey());
//				    dto.setProductMap(entry.getValue());
//				    listData.add(dto);
//				}
//				data.setListProductMap(listData);
				data.setTopProductMapString(gson.toJson(data.getTopProductMap()));
				data.setTopProductMap(null);
			}else {
				throw new Exception("Data Null Or Empty");
			}
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw e;
		}
		return data;
	}

	@Override
	public ResponseData getProductDetailData(String requestPayload) throws Exception {
		ResponseData response = null;
		ProductDetail data = null;
		try {
			JsonAPI jsonAPI = new JsonAPI();
			Gson gson = new Gson();
			response = new ResponseData();
			
			
			String productDesc = jsonAPI.callAPIJson(requestPayload, urlProductDetail);
			data = gson.fromJson(productDesc, ProductDetail.class);
			
			if(data!=null) {
				if(data.getResponseCode().equals(ApplicationConstants.RESPONSE_CODE_SUCCESS)) {
					if((data.getTopProductMap()!=null && data.getTopProductMap().size() > 0) && (data.getProductCurrencyCodeMap()!=null && data.getProductCurrencyCodeMap().size() > 0) && (data.getFromAccountMap()!=null && data.getFromAccountMap().size() > 0)) {
						data.setProductHeirRelationshipList(convertMaptoListStringData(data.getProductHeirRelationshipMap()));
						data.setProductHeirRelationshipMapString(gson.toJson(data.getProductHeirRelationshipMap()));
						data.setProductHeirRelationshipMap(null);
						data.setProductMonthlyAverageTrnxList(convertMaptoListStringData(data.getProductMonthlyAverageTrnxMap()));
						data.setProductMonthlyAverageTrnxMapString(gson.toJson(data.getProductMonthlyAverageTrnxMap()));
						data.setProductMonthlyAverageTrnxMap(null);
						data.setProductOriginOfFundList(convertMaptoListStringData(data.getProductOriginOfFundMap()));
						data.setProductOriginOfFundMapString(gson.toJson(data.getProductOriginOfFundMap()));
						data.setProductOriginOfFundMap(null);
						data.setProductObjectiveOfAccountList(convertMaptoListStringData(data.getProductObjectiveOfAccountMap()));
						data.setProductObjectiveOfAccountMapString(gson.toJson(data.getProductObjectiveOfAccountMap()));
						data.setProductObjectiveOfAccountMap(null);
						data.setProductProgramList(convertMaptoListStringData(data.getProductProgramMap()));
						data.setProductProgramMapString(gson.toJson(data.getProductProgramMap()));
						data.setProductProgramMap(null);
						data.setProductTermList(convertMaptoListStringData(data.getProductTermMap()));
						data.setProductTermMapString(gson.toJson(data.getProductTermMap()));
						data.setProductTermMap(null);
						
						List<ProductCurrencyMapDTO> listData = new ArrayList<ProductCurrencyMapDTO>();
						for (Map.Entry<String, ProductCurrencyCodeMap> entry : data.getProductCurrencyCodeMap().entrySet()) {
							ProductCurrencyMapDTO dto = new ProductCurrencyMapDTO();
						    dto.setProductCurrencyKey(entry.getKey());
						    dto.setProductCurrencyCodeMap(entry.getValue());
						    listData.add(dto);
						}
						data.setProductCurrencyCodeList(listData);
						data.setProductCurrencyCodeMapString(gson.toJson(data.getProductCurrencyCodeMap()));
						data.setProductCurrencyCodeMap(null);
						
						List<FromAccountMapDTO> listFromAccount = new ArrayList<FromAccountMapDTO>();
						if(data.getFromAccountMap()!=null) {
							data.setFromAccountMapString(gson.toJson(data.getFromAccountMap()));
						}
						for (Map.Entry<String, FromAccountMap> entry : data.getFromAccountMap().entrySet()) {
							FromAccountMapDTO dto = new FromAccountMapDTO();
						    dto.setFromAccountKey(entry.getKey());
						    dto.setFromAccountMap(entry.getValue());
						  //!!!ACHMAD!!! REMOVE WHEN PENRIL ALREADY FIXED
						    if(dto.getFromAccountMap()!=null && (dto.getFromAccountMap().getApplCode()!=null && dto.getFromAccountMap().getApplCode().equals(ApplicationConstants.SAVING_CODE))) {
						    	dto.getFromAccountMap().setAccountNoDisplay(ApplicationConstants.SAVING_DESC);
						    }else if(dto.getFromAccountMap()!=null && (dto.getFromAccountMap().getApplCode()!=null && dto.getFromAccountMap().getApplCode().equals(ApplicationConstants.GIRO_CODE))) {
						    	dto.getFromAccountMap().setAccountNoDisplay(ApplicationConstants.GIRO_DESC);
						    }
						    listFromAccount.add(dto);
						}
						data.setFromAccountList(listFromAccount);
						data.setFromAccountMap(null);
						
						if(data.getServiceInfoBean()!=null) {
							data.setServiceInfoBeanString(gson.toJson(data.getServiceInfoBean()));
						}
						
						data.setTopProductMapString(gson.toJson(data.getTopProductMap()));
						data.setTopProductMap(null);
						
						response.setProductDetail(data);
						response.setResponseCode(data.getResponseCode());
						response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_SUCCESS);
						response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_SUCCESS);
					}else {
						response.setResponseCode(ApplicationConstants.RESPONSE_CODE_ERROR);
						response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_DATA_NOT_FOUND_EN);
						response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_DATA_NOT_FOUND_IN);
						logger.info("REQUEST PRODUCT DETAIL :: "+requestPayload.replaceAll("\n", "").replaceAll("\r", ""));
						logger.info("RESPONSE PRODUCT DETAIL :: "+productDesc.replaceAll("\n", "").replaceAll("\r", ""));
					}
				}else {
					response.setResponseCode(data.getResponseCode());
					if(data.getResponseMessage()!=null && !data.getResponseMessage().isEmpty()) {
						response.setResponseMessageEN(data.getResponseMessage());
						response.setResponseMessageIN(data.getResponseMessage());
					}else {
						response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_EN);
						response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_IN);
					}
					logger.info("REQUEST PRODUCT DETAIL :: "+requestPayload.replaceAll("\n", "").replaceAll("\r", ""));
					logger.info("RESPONSE PRODUCT DETAIL :: "+productDesc.replaceAll("\n", "").replaceAll("\r", ""));
				}
			}else {
				response.setResponseCode(ApplicationConstants.RESPONSE_CODE_ERROR);
				response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_EN);
				response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_IN);
				logger.info("REQUEST PRODUCT DETAIL :: "+requestPayload.replaceAll("\n", "").replaceAll("\r", ""));
				logger.info("RESPONSE PRODUCT DETAIL :: "+productDesc.replaceAll("\n", "").replaceAll("\r", ""));
			}
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw e;
		}
		return response;
	}
	
	@Override
	public ResponseData savingConfirmationETBProcess(String requestPayload) throws Exception {
		ResponseData response = null;
		SavingConfirmation data = null;
		String tacPhoneNo = null;
		try {
			JsonAPI jsonAPI = new JsonAPI();
			Gson gson = new Gson();
			response = new ResponseData();
			
			JSONObject json = new JSONObject(requestPayload);
			if(json.get(ApplicationConstants.TAC_PHONE_NO).toString()!=null) {
				tacPhoneNo = json.get(ApplicationConstants.TAC_PHONE_NO).toString();
				json.remove(ApplicationConstants.TAC_PHONE_NO);
			}
			
			
			String savingConfirmation = jsonAPI.callAPIJson(json.toString(), urlSavingConfirmation);
			data = gson.fromJson(savingConfirmation, SavingConfirmation.class);
			
			if(data!=null) {
				if(data.getResponseCode().equals(ApplicationConstants.RESPONSE_CODE_SUCCESS)) {
					if((data.getTopProductMap()!=null && data.getTopProductMap().size() > 0) && (data.getProductCurrencyCodeMap()!=null && data.getProductCurrencyCodeMap().size() > 0) && (data.getFromAccountMap()!=null && data.getFromAccountMap().size() > 0)) {
						
						data.setProductHeirRelationshipList(convertMaptoListStringData(data.getProductHeirRelationshipMap()));
						data.setProductHeirRelationshipMapString(gson.toJson(data.getProductHeirRelationshipMap()));
						data.setProductHeirRelationshipMap(null);
						data.setProductMonthlyAverageTrnxList(convertMaptoListStringData(data.getProductMonthlyAverageTrnxMap()));
						data.setProductMonthlyAverageTrnxMapString(gson.toJson(data.getProductMonthlyAverageTrnxMap()));
						data.setProductMonthlyAverageTrnxMap(null);
						data.setProductOriginOfFundList(convertMaptoListStringData(data.getProductOriginOfFundMap()));
						data.setProductOriginOfFundMapString(gson.toJson(data.getProductOriginOfFundMap()));
						data.setProductOriginOfFundMap(null);
						data.setProductObjectiveOfAccountList(convertMaptoListStringData(data.getProductObjectiveOfAccountMap()));
						data.setProductObjectiveOfAccountMapString(gson.toJson(data.getProductObjectiveOfAccountMap()));
						data.setProductObjectiveOfAccountMap(null);
						data.setProductProgramList(convertMaptoListStringData(data.getProductProgramMap()));
						data.setProductProgramMapString(gson.toJson(data.getProductProgramMap()));
						data.setProductProgramMap(null);
						data.setProductTermList(convertMaptoListStringData(data.getProductTermMap()));
						data.setProductTermMapString(gson.toJson(data.getProductTermMap()));
						data.setProductTermMap(null);
						
						List<ProductCurrencyMapDTO> listData = new ArrayList<ProductCurrencyMapDTO>();
						for (Map.Entry<String, ProductCurrencyCodeMap> entry : data.getProductCurrencyCodeMap().entrySet()) {
							ProductCurrencyMapDTO dto = new ProductCurrencyMapDTO();
						    dto.setProductCurrencyKey(entry.getKey());
						    dto.setProductCurrencyCodeMap(entry.getValue());
						    listData.add(dto);
						}
						data.setProductCurrencyCodeList(listData);
						data.setProductCurrencyCodeMapString(gson.toJson(data.getProductCurrencyCodeMap()));
						data.setProductCurrencyCodeMap(null);
						
						List<FromAccountMapDTO> listFromAccount = new ArrayList<FromAccountMapDTO>();
						for (Map.Entry<String, FromAccountMap> entry : data.getFromAccountMap().entrySet()) {
							FromAccountMapDTO dto = new FromAccountMapDTO();
						    dto.setFromAccountKey(entry.getKey());
						    dto.setFromAccountMap(entry.getValue());
						    listFromAccount.add(dto);
						}
						data.setFromAccountList(listFromAccount);
						if(data.getFromAccountMap()!=null) {
							data.setFromAccountMapString(gson.toJson(data.getFromAccountMap()));
						}
						data.setFromAccountMap(null);
						if(data.getServiceInfoBean()!=null) {
							data.setServiceInfoBeanString(gson.toJson(data.getServiceInfoBean()));
						}
						
						data.setTopProductMapString(gson.toJson(data.getTopProductMap()));
						data.setTopProductMap(null);
						
						if(data.getMonetaryInformationMap()!=null) {
							data.setMonetaryInformationString(gson.toJson(data.getMonetaryInformationMap()));
						}
						
						if(data.getTacBean()!=null) {
							if((tacPhoneNo!=null && !tacPhoneNo.isEmpty()) && (data.getTacBean().getTacMobileNo()==null || data.getTacBean().getTacMobileNo().isEmpty())) {
								data.getTacBean().setTacMobileNo(tacPhoneNo);
							}
							data.setTacBeanString(gson.toJson(data.getTacBean()));
							
						}
						
						response.setSavingConfirmation(data);
						response.setResponseCode(data.getResponseCode());
						response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_SUCCESS);
						response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_SUCCESS);
					}else {
						response.setResponseCode(ApplicationConstants.RESPONSE_CODE_ERROR);
						response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_DATA_NOT_FOUND_EN);
						response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_DATA_NOT_FOUND_IN);
						logger.info("REQUEST CONFIRMATION SAVING :: "+requestPayload.replaceAll("\n", "").replaceAll("\r", ""));
						logger.info("RESPONSE CONFIRMATION SAVING :: "+savingConfirmation.replaceAll("\n", "").replaceAll("\r", ""));
					}
				}else {
					response.setResponseCode(data.getResponseCode());
					if(data.getResponseMessage()!=null && !data.getResponseMessage().isEmpty()) {
						response.setResponseMessageEN(data.getResponseMessage());
						response.setResponseMessageIN(data.getResponseMessage());
					}else {
						response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_EN);
						response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_IN);
					}
					logger.info("REQUEST CONFIRMATION SAVING :: "+requestPayload.replaceAll("\n", "").replaceAll("\r", ""));
					logger.info("RESPONSE CONFIRMATION SAVING :: "+savingConfirmation.replaceAll("\n", "").replaceAll("\r", ""));
				}
			}else {
				response.setResponseCode(ApplicationConstants.RESPONSE_CODE_ERROR);
				response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_EN);
				response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_IN);
				logger.info("REQUEST CONFIRMATION SAVING :: "+requestPayload.replaceAll("\n", "").replaceAll("\r", ""));
				logger.info("RESPONSE CONFIRMATION SAVING :: "+savingConfirmation.replaceAll("\n", "").replaceAll("\r", ""));
			}
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw e;
		}
		return response;
	}
	
	@Override
	public ResponseData savingResultETBProcess(String requestPayload) throws Exception {
		ResponseData response = null;
		SavingResult data = null;	
		try {
			JsonAPI jsonAPI = new JsonAPI();
			Gson gson = new Gson();
			response = new ResponseData();
			
			JSONObject json = new JSONObject(requestPayload);
			json.put(ApplicationConstants.REMOTE_IP_ADDR, ipAddress);
			
			String savingResult = jsonAPI.callAPIJson(json.toString(), urlSavingResult);
			data = gson.fromJson(savingResult, SavingResult.class);
			
			if(data!=null) {
				if(data.getResponseCode().equals(ApplicationConstants.RESPONSE_CODE_SUCCESS)) {
					if((data.getTopProductMap()!=null && data.getTopProductMap().size() > 0) && (data.getProductCurrencyCodeMap()!=null && data.getProductCurrencyCodeMap().size() > 0) && (data.getFromAccountMap()!=null && data.getFromAccountMap().size() > 0)) {
						
						data.setProductHeirRelationshipList(convertMaptoListStringData(data.getProductHeirRelationshipMap()));
						data.setProductHeirRelationshipMap(null);
						data.setProductMonthlyAverageTrnxList(convertMaptoListStringData(data.getProductMonthlyAverageTrnxMap()));
						data.setProductMonthlyAverageTrnxMap(null);
						data.setProductOriginOfFundList(convertMaptoListStringData(data.getProductOriginOfFundMap()));
						data.setProductOriginOfFundMap(null);
						data.setProductObjectiveOfAccountList(convertMaptoListStringData(data.getProductObjectiveOfAccountMap()));
						data.setProductObjectiveOfAccountMap(null);
						data.setProductProgramList(convertMaptoListStringData(data.getProductProgramMap()));
						data.setProductProgramMap(null);
						data.setProductTermList(convertMaptoListStringData(data.getProductTermMap()));
						data.setProductTermMap(null);
						
						List<ProductCurrencyMapDTO> listData = new ArrayList<ProductCurrencyMapDTO>();
						for (Map.Entry<String, ProductCurrencyCodeMap> entry : data.getProductCurrencyCodeMap().entrySet()) {
							ProductCurrencyMapDTO dto = new ProductCurrencyMapDTO();
						    dto.setProductCurrencyKey(entry.getKey());
						    dto.setProductCurrencyCodeMap(entry.getValue());
						    listData.add(dto);
						}
						data.setProductCurrencyCodeList(listData);
						data.setProductCurrencyCodeMap(null);
						
						List<FromAccountMapDTO> listFromAccount = new ArrayList<FromAccountMapDTO>();
						for (Map.Entry<String, FromAccountMap> entry : data.getFromAccountMap().entrySet()) {
							FromAccountMapDTO dto = new FromAccountMapDTO();
						    dto.setFromAccountKey(entry.getKey());
						    dto.setFromAccountMap(entry.getValue());
						    listFromAccount.add(dto);
						}
						data.setFromAccountList(listFromAccount);
						data.setFromAccountMap(null);
						data.setTopProductMap(null);
						
						response.setSavingResult(data);
						response.setResponseCode(data.getResponseCode());
						response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_SUCCESS);
						response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_SUCCESS);
						
					}else {
						response.setResponseCode(ApplicationConstants.RESPONSE_CODE_ERROR);
						response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_DATA_NOT_FOUND_EN);
						response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_DATA_NOT_FOUND_IN);
						logger.info("REQUEST RESULT SAVING :: "+requestPayload.replaceAll("\n", "").replaceAll("\r", ""));
						logger.info("RESPONSE RESULT SAVING :: "+savingResult.replaceAll("\n", "").replaceAll("\r", ""));
					}
				}else {
					response.setResponseCode(data.getResponseCode());
					if(data.getResponseMessage()!=null && !data.getResponseMessage().isEmpty()) {
						response.setResponseMessageEN(data.getResponseMessage());
						response.setResponseMessageIN(data.getResponseMessage());
					}else {
						response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_EN);
						response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_IN);
					}
					logger.info("REQUEST RESULT SAVING :: "+requestPayload.replaceAll("\n", "").replaceAll("\r", ""));
					logger.info("RESPONSE RESULT SAVING :: "+savingResult.replaceAll("\n", "").replaceAll("\r", ""));
				}
			}else {
				response.setResponseCode(ApplicationConstants.RESPONSE_CODE_ERROR);
				response.setResponseMessageEN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_EN);
				response.setResponseMessageIN(ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_IN);
				logger.info("REQUEST RESULT SAVING :: "+requestPayload.replaceAll("\n", "").replaceAll("\r", ""));
				logger.info("RESPONSE RESULT SAVING :: "+savingResult.replaceAll("\n", "").replaceAll("\r", ""));
			}
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw e;
		}
		return response;
	}
	
	private List<CommonListDTO> convertMaptoListStringData(LinkedHashMap<String, String> dataMap) throws Exception {
		List<CommonListDTO> listData = null;
		try {
			if(dataMap!=null && dataMap.size() > 0) {
				listData = new ArrayList<CommonListDTO>();
				for (Map.Entry<String, String> entry : dataMap.entrySet()) {
					CommonListDTO dto = new CommonListDTO();
					dto.setKey(entry.getKey());
					dto.setData(entry.getValue());
					listData.add(dto);
				}
			}else {
				throw new Exception("Data Null Or Empty");
			}
		} catch (Exception e) {
			throw e;
		}
		return listData;
	}

}
