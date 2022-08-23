package com.tianna.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author tiancn
 * @date 2022/8/22 14:41
 *
 * 拦截器的三个方法：
 * preHandle():在控制器方法执行之前，其返回值表示对控制器方法的拦截(false)或放行(true)
 * postHandle():在控制器方法执行之后执行
 * afterCompletion():在控制器方法执行之后，且渲染视图完毕之后执行
 *
 * 多个拦截器的的执行顺序和在SpringMVC的配置文件中配置的顺序有关
 * preHandle()按照配置的顺序执行，而 postHandle()和afterCompletion()按照配置的反序执行。
 *
 * 若拦截器中某个拦截器的preHandle()返回了false
 * preHandle()方法返回false的拦截器和它之前的拦截器的preHandle()方法都会执行
 * 所有的拦截器的postHandle()方法都不执行
 * preHandle()方法返回false的拦截器之前的拦截器的afterCompletion()方法会执行,而preHandle()方法返回false的拦截器的afterCompletion()方法不会执行
 */
public class FirstInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("FirstInterceptor-->preHandle");
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("FirstInterceptor-->postHandle");
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("FirstInterceptor-->afterCompletion");
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
