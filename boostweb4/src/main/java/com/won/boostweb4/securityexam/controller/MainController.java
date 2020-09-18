package com.won.boostweb4.securityexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping("/main")
    @ResponseBody
    public String main(){
        return "main page";
    }

    @RequestMapping("/securepage")
    @ResponseBody
    public String securitypage(){
        return "secure page";
    }
}