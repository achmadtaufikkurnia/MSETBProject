package com.move.etb.boot.service;

import com.move.etb.boot.model.ProductDescription;
import com.move.etb.boot.model.ResponseData;

public interface ProductETBService {
	
	public ResponseData getProductListData(String requestPayload) throws Exception;
	
	public ProductDescription getProductDescData(String requestPayload) throws Exception;
	
	public ResponseData getProductDetailData(String requestPayload) throws Exception;
	
	public ResponseData savingConfirmationETBProcess(String requestPayload) throws Exception;
	
	public ResponseData savingResultETBProcess(String requestPayload) throws Exception;
}
