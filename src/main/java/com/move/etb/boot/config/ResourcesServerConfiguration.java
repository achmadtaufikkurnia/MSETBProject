package com.move.etb.boot.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

import com.move.etb.boot.exception.AuthEntryPointException;

@EnableResourceServer
@Configuration
public class ResourcesServerConfiguration extends ResourceServerConfigurerAdapter  {

	
	@Bean
	@ConfigurationProperties(prefix = "api.datasource")
	public DataSource apiDataSource() {
		return DataSourceBuilder.create().build();
	}
	
	@Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
		TokenStore tokenStore = new JdbcTokenStore(apiDataSource());
		resources.resourceId("product_api").tokenStore(tokenStore).authenticationEntryPoint(new AuthEntryPointException());
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/actuator/**").permitAll()
		.antMatchers("/health").permitAll()
		.anyRequest().authenticated()
		.and().headers().addHeaderWriter((request, response) -> {
				response.addHeader("Access-Control-Allow-Origin", "*");
				if (request.getMethod().equals("OPTIONS")) {
					response.setHeader("Access-Control-Allow-Methods",
							request.getHeader("Access-Control-Request-Method"));
					response.setHeader("Access-Control-Allow-Headers",
							request.getHeader("Access-Control-Request-Headers"));
				}
			});
	}
	
}
