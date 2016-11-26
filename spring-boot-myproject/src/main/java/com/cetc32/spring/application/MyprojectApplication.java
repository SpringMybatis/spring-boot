package com.cetc32.spring.application;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.cetc32.spring.boot.servlet.MyServlet;

@SpringBootApplication
@ComponentScan("com.cetc32.spring.boot")
@ServletComponentScan("com.cetc32.spring.boot")
public class MyprojectApplication {
	
	private static final Logger logger = LogManager.getLogger(MyprojectApplication.class);

	public static void main(String[] args) {
		logger.info("start");
		SpringApplication.run(MyprojectApplication.class, args);
	}

	
	/**
     * 使用代码注册Servlet（不需要@ServletComponentScan注解）
     *
     * @return
     * @author SHANHY
     * @create  2016年1月6日
     */
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new MyServlet(), "/myservlet/*");
    }
	
    
    /**
     * 修改DispatcherServlet默认配置
     *
     * @param dispatcherServlet
     * @return
     * @author SHANHY
     * @create  2016年1月6日
     */
    /*@Bean
    public ServletRegistrationBean dispatcherRegistration(DispatcherServlet dispatcherServlet) {
        ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet);
        registration.getUrlMappings().clear();
        registration.addUrlMappings("*.do");
        registration.addUrlMappings("*.json");
        return registration;
    }*/
}
