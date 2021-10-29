package com.example.filters;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.mvc.condition.RequestCondition;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class MyFilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		
		
		//conditions for when to filter, I'm going to always filter!
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		//Our filter logic can happen!
		
		RequestContext context = RequestContext.getCurrentContext();
		HttpServletRequest myRequest = context.getRequest();
		
		System.out.println("The method of the request: " + myRequest.getMethod());
		System.out.println("The uri of the request: " + myRequest.getRequestURI());
		return null;
	}

	@Override
	public String filterType() { //pre filter
		
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

}
