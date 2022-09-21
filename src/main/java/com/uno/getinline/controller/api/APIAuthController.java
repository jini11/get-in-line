package com.uno.getinline.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api") // 뷰(controller)와 구분해주기 위해
@RestController // 데이터를 서빙하는 웹 api @Controller + @ResponseBody
public class APIAuthController {

    @GetMapping("/sign-up")
    public String signUp() {
        return "done."; // @ResponseBody 특징 : 데이터 그대로 바디로 응답
   }

   @GetMapping("/login")
    public String login() {
        return "done.";
   }
}
