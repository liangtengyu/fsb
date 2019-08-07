package com.lty.fsb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by  lty
 * on  2019-08-07  10:22
 */
@RestController
public class HomeController {
    @RequestMapping("home")
    public String home(){
        return "homePage";
    }

}

