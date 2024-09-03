package com.fundamentals.fundamentals.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fundamentals.fundamentals.dtos.ParamDto;
import com.fundamentals.fundamentals.dtos.ParamsDto;

import jakarta.servlet.http.HttpServletRequest;

@RestController()
@RequestMapping("/api/params")
public class RequestParamsController {

  // http://localhost:3500/api/params/foo?message=hello%20world
  @GetMapping("/foo")
  public ParamDto foo(@RequestParam(required = false, defaultValue = "hi") String message) {
    ParamDto param = new ParamDto();
    param.setMessage(message);
    return param;
  }

  // http://localhost:3500/api/params/bar?text=hi&code=110
  @GetMapping("/bar")
  public ParamsDto bar(@RequestParam() String text, @RequestParam() Integer code) {
    ParamsDto params = new ParamsDto();
    params.setMessage(text);
    params.setCode(code);
    return params;
  }

  // http://localhost:3500/api/params/request-with-servlet?text=hi&code=110
  @GetMapping("/request-with-servlet")
  public ParamsDto requestWithServlet (HttpServletRequest request) {
    Integer code = 0;
    try {
      code = Integer.parseInt(request.getParameter("code"));
    } catch (NumberFormatException e) {}
    ParamsDto params = new ParamsDto();
    params.setMessage(request.getParameter("text"));
    params.setCode(code);
    return params;
  }

}
