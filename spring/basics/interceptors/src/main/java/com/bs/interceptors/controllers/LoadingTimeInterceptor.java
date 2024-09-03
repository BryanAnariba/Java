package com.bs.interceptors.controllers;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// La idea es implementar un logger como nest, que antes que se ejecute la peticion, poder llamarlo

@Component("loadingTimeInterceptor")
public class LoadingTimeInterceptor implements HandlerInterceptor {

  private static final Logger logger = LoggerFactory.getLogger(LoadingTimeInterceptor.class);

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    HandlerMethod controller = ((HandlerMethod)handler);
    LoadingTimeInterceptor.logger.info("LoadingTimeInterceptor: executing preHandle() -> " + controller.getMethod().getName());

    // Calculando el tiempo que lleva de preHandle a postHandle, simulamos un delay
    long start = System.currentTimeMillis();
    request.setAttribute("start", start);
    Random random = new Random();

    int delay = random.nextInt(500);
    Thread.sleep(delay); // con esto la peticion en postman tiene un delay sea de 0 - 500 aleatorio puede que sea 300 en una request o 100 en otra o 35 en otra

    return true;
  }

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    long end = System.currentTimeMillis();
    long start = (long)request.getAttribute("start");
    long result = end - start;
    LoadingTimeInterceptor.logger.info("Tiempo transcurrido en la peticion de pre y post handle: " + result);
    LoadingTimeInterceptor.logger.info("LoadingTimeInterceptor: executing postHandle() -> " + ((HandlerMethod)handler).getMethod().getName());
  }
  
}
