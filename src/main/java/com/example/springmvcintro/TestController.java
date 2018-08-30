package com.example.springmvcintro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/testy")
public class TestController {



    @GetMapping("/test1")
    @ResponseBody
    public String hello(HttpServletRequest request){
        String remoteAddr = request.getRemoteAddr();

        return "Cześć! tutaj Agata. Wszystko działa!, Twoj adres IP to " + remoteAddr;
    }
}
