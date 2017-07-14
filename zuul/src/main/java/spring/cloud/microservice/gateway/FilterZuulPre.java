package spring.cloud.microservice.gateway;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class FilterZuulPre extends ZuulFilter {

    @Override
    public Object run() {
        System.out.println("zuulfilter run");
        RequestContext requestContext = RequestContext.getCurrentContext();
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

    /**
     * pre：可以在请求被路由之前调用。
     * routing：在路由请求时候被调用。
     * post：在routing和error过滤器之后被调用。
     * error：处理请求时发生错误时被调用。
     *
     * @return
     */
    @Override
    public String filterType() {
        System.out.println("zuulfilter filterType");
        return "pre";
    }

}
