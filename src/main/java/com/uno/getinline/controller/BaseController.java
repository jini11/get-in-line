package com.uno.getinline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController { // ErrorController 상속받아 에러 페이지 권한을 주도할 수 있음

    @GetMapping("/")
    public String root() throws Exception{
        //throw new Exception("테스트");
        return "index";
    }

}
