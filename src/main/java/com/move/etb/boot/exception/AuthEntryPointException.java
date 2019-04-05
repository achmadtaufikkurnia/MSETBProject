package com.move.etb.boot.exception;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.move.etb.boot.util.CommonUtils;

public class AuthEntryPointException implements AuthenticationEntryPoint {

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
		String timestamp = CommonUtils.getDateToString(new Date(), CommonUtils.YYYYMMDDHHMMSSX);
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("responseCode", Integer.toString(HttpServletResponse.SC_UNAUTHORIZED));
		map.put("responseMessageEN", authException.getMessage());
		map.put("responseMessageIN", authException.getMessage());
		map.put("timestamp", timestamp);
		response.setContentType("application/json");
		response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		try {
			ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(response.getOutputStream(), map);
		} catch (Exception e) {
			throw e;
		}
	}

}
