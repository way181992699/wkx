package com.wkx.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.wkx.controller.interceptor.FirstInterceptor;

@Configuration
public class wkxInterceptorConfigurer implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		registry.addInterceptor(new FirstInterceptor()).addPathPatterns("/My/**");
		WebMvcConfigurer.super.addInterceptors(registry);
	}

		
	
}
