package com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan("com.*")
public class WebAppConfig extends WebMvcConfigurerAdapter 
{
	public WebAppConfig()
	{
	System.out.println("WebAppConfig is instantiated ");
    }
	@Bean(name="multipartResolver")
	public CommonsMultipartResolver commonsMultipartResolver(){
		CommonsMultipartResolver  commonsMultipartResolver=new CommonsMultipartResolver();
		commonsMultipartResolver.setMaxUploadSize(20971520); // 20MB
		commonsMultipartResolver.setMaxInMemorySize(1048576);	// 1MB
		return commonsMultipartResolver;
	}
}
