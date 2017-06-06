package com.task.mgn.auth.configuration;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class ErrorConfiguration implements EmbeddedServletContainerCustomizer{

	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		container.addErrorPages(new ErrorPage(HttpStatus.BAD_REQUEST,"/errors/400.jsp"));
		  container.addErrorPages(new ErrorPage(HttpStatus.UNAUTHORIZED,"/errors/401.jsp"));
		  container.addErrorPages(new ErrorPage(HttpStatus.PAYMENT_REQUIRED,"/errors/402.jsp"));
		  container.addErrorPages(new ErrorPage(HttpStatus.FORBIDDEN,"/errors/403.jsp"));
		  container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND,"/errors/404.jsp"));
		  container.addErrorPages(new ErrorPage(HttpStatus.METHOD_NOT_ALLOWED,"/errors/405.jsp"));
		  container.addErrorPages(new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"/errors/500.jsp"));
		  container.addErrorPages(new ErrorPage(HttpStatus.NOT_IMPLEMENTED,"/errors/501.jsp"));
		  container.addErrorPages(new ErrorPage(HttpStatus.SERVICE_UNAVAILABLE,"/errors/502.jsp"));
		  container.addErrorPages(new ErrorPage(HttpStatus.GATEWAY_TIMEOUT,"/errors/503.jsp"));
		
	}

}
