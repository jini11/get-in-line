package com.uno.getinline.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@ControllerAdvice(basePackageClasses = BaseController.class)
@Controller
public class BaseController { // ErrorController 상속받아 에러 페이지 권한을 주도할 수 있음

    @GetMapping("/")
    public String root() throws Exception{
        throw new Exception("테스트");
        //return "index";
    }

}
