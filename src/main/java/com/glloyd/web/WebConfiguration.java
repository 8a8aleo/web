package com.glloyd.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class WebConfiguration 
{
	private static final String VIEW_DIR_HTML = "/WEB-INF/static/";
	private static final String VIEW_EXTN_HTML = ".html";
	
	private static final String VIEW_DIR_JSP = "/WEB-INF/";
	private static final String VIEW_EXTN_JSP = ".jsp";
	
	@Bean
    public ViewResolver htmlViewResolver() {
        InternalResourceViewResolver viewResolver= new InternalResourceViewResolver();
        viewResolver.setPrefix(VIEW_DIR_HTML);
        viewResolver.setSuffix(VIEW_EXTN_HTML);
        viewResolver.setOrder(0);
        return viewResolver;
    }

	@Bean
    public ViewResolver jspViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix(VIEW_DIR_JSP);
        viewResolver.setSuffix(VIEW_EXTN_JSP);
        viewResolver.setOrder(1);
        return viewResolver;
    }
}
