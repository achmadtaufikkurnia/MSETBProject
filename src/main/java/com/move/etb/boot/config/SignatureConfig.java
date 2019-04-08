package com.move.etb.boot.config;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.move.etb.boot.model.SignatureData;

@Service
public class SignatureConfig {
	
	@Value("${url.signature}")
	private String url;
	
	public SignatureData getSignatureData(String requestPayload,String httpMethod,HttpServletRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("HTTPMethod", httpMethod);
		Enumeration headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
		    String key = (String) headerNames.nextElement();
		    String value = request.getHeader(key);
		    headers.add(key, value);
		}
		HttpEntity<String> entity = new HttpEntity<String>(requestPayload, headers);
		SignatureData response = restTemplate.postForObject(url, entity, SignatureData.class);
		return response;
	}

}
