package com.jt.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.jt.interceptor.UserInterceptor;

@Configuration
public class MvcConfigurer implements WebMvcConfigurer{
	
	//开启匹配后缀型配置
	@Autowired
	private UserInterceptor userInterceptor;
	@Override
	public void configurePathMatch(PathMatchConfigurer configurer) {
		
		configurer.setUseSuffixPatternMatch(true);
	}
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(userInterceptor).addPathPatterns("/cart/**","/order/**");
	}
}