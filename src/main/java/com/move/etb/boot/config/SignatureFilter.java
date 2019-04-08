package com.move.etb.boot.config;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.move.etb.boot.constant.ApplicationConstants;
import com.move.etb.boot.model.Signature;
import com.move.etb.boot.model.SignatureData;
import com.move.etb.boot.util.CommonUtils;

@Component

public class SignatureFilter implements Filter {
	
	@Autowired
	private SignatureConfig signatureConfig;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		SignatureData signatureData = null;
//		BufferedReader reader = null;
//		StringBuffer bufferData = new StringBuffer();
//		String line = null;
		RequestWrapper req = new RequestWrapper((HttpServletRequest) request);
		String signature = req.getHeader("signature");
//		reader = req.getReader();
//		while ((line = reader.readLine())!=null) {
//			bufferData.append(line+"\n");
//		}
		if(!req.getBody().isEmpty()) {
			signatureData = signatureConfig.getSignatureData(req.getBody(), req.getMethod(), req);
		}else {
			signatureData = signatureConfig.getSignatureData(null, req.getMethod(), req);
		}
		
		if(signatureData!=null && signatureData.getResponseCode().equals("00")) {
			Signature data = signatureData.getSignatureData();
			if(signature!=null && !signature.isEmpty() && (data!=null && data.getSignature()!=null && signature.equals(data.getSignature()))) {
				chain.doFilter(req, response);
			}else {
				HttpServletResponse res = (HttpServletResponse) response;
				String timestamp = CommonUtils.getDateToString(new Date(), CommonUtils.YYYYMMDDHHMMSSX);
				Map<String, Object> map = new HashMap<String,Object>();
				map.put("responseCode", Integer.toString(HttpServletResponse.SC_UNAUTHORIZED));
				map.put("responseMessageEN", ApplicationConstants.UNAUTHORIZED_MESSAGE_EN);
				map.put("responseMessageIN", ApplicationConstants.UNAUTHORIZED_MESSAGE_IN);
				map.put("timestamp", timestamp);
				res.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				res.setContentType("application/json");
				ObjectMapper mapper = new ObjectMapper();
	            mapper.writeValue(response.getOutputStream(), map);
			}
		}else {
			HttpServletResponse res = (HttpServletResponse) response;
			if(signatureData!=null) {
				Map<String, Object> map = new HashMap<String,Object>();
				map.put("responseCode", Integer.toString(HttpServletResponse.SC_UNAUTHORIZED));
				map.put("responseMessageEN", signatureData.getResponseMessageEN());
				map.put("responseMessageIN", signatureData.getResponseMessageIN());
				if(signatureData.getErrorSystemMessage()!=null && !signatureData.getErrorSystemMessage().isEmpty()) {
					map.put("errorSystemMessage", signatureData.getErrorSystemMessage());
				}
				map.put("timestamp", signatureData.getTimestamp());
				res.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				res.setContentType("application/json");
				ObjectMapper mapper = new ObjectMapper();
	            mapper.writeValue(response.getOutputStream(), map);
			}else {
				String timestamp = CommonUtils.getDateToString(new Date(), CommonUtils.YYYYMMDDHHMMSSX);
				Map<String, Object> map = new HashMap<String,Object>();
				map.put("responseCode", ApplicationConstants.RESPONSE_CODE_ERROR);
				map.put("responseMessageEN", ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_EN);
				map.put("responseMessageIN", ApplicationConstants.RESPONSE_MESSAGE_SYSTEM_UNAVAILABLE_IN);
				map.put("errorSystemMessage", "Signature Data Not Found");
				map.put("timestamp", timestamp);
				res.setContentType("application/json");
				ObjectMapper mapper = new ObjectMapper();
	            mapper.writeValue(response.getOutputStream(), map);
			}
		}
	}

}
