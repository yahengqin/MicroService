package spring.cloud.microservice.gateway;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class FilterZuulPre extends  ZuulFilter {

	@Override
	public Object run() {
		System.out.println("zuulfilter run");
		RequestContext requestContext =  RequestContext.getCurrentContext();
	    HttpServletRequest request = requestContext.getRequest();
	    System.out.println(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
		return null;
	}

	@Override
	public boolean shouldFilter() {
		System.out.println("zuulfilter shouldFilter");
		return true;
	}

	@Override
	public int filterOrder() {
		System.out.println("zuulfilter filterOrder");
		return 0;
	}

	@Override
	public String filterType() {
		System.out.println("zuulfilter filterType");
		return "pre";
	}

}
