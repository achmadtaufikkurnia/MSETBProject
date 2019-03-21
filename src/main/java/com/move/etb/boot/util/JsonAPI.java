package com.move.etb.boot.util;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAPI {
	
	
	public static String objectConvertJson(Object obj) {
		
		 ObjectMapper mapper = new ObjectMapper();
		String mrJson = "";
		try {
			mrJson = mapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mrJson;
	}
	
	
	public String callAPIJson(String json,String uri) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>(json, headers);
		String response = restTemplate.postForObject(uri, entity, String.class);
		return response;
		
	}
	
	public String callAPIJsonObject(Object obj,String uri) {
		String response = "";
		try {
			RestTemplate restTemplate = new RestTemplate(getClientHttpRequestFactory());
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			ObjectMapper mapper = new ObjectMapper();
			String mrJson = mapper.writeValueAsString(obj);
			System.out.println("request "+mrJson);
			HttpEntity<String> entity = new HttpEntity<String>(mrJson, headers);
			response = restTemplate.postForObject(uri, entity,String.class);
			System.out.println("response "+response);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return response;
		
	}
	
	
	
	
	
	private ClientHttpRequestFactory getClientHttpRequestFactory() {
	    int timeout = 130000;
	    HttpComponentsClientHttpRequestFactory clientHttpRequestFactory =
	      new HttpComponentsClientHttpRequestFactory();
	    clientHttpRequestFactory.setConnectTimeout(timeout);
	    clientHttpRequestFactory.setReadTimeout(130000);
	    return clientHttpRequestFactory;
	}

}
