package com.demo.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
	@Bean
	public Oneplus getPhone() 
	{
		return new Oneplus();
	}
	
	@Bean
	public MobileProcessor getProcessor()
	{
		return new MediaTek();
	}
}
